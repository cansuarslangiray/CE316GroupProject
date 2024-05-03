import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compiler {
    public static String compileAndRun(String compilerPath, String sourceCodePath, String outputExecutablePath) {
        try {
            List<String> compileCommand = Arrays.asList(compilerPath, "-o", outputExecutablePath, sourceCodePath);
            ProcessBuilder compileBuilder = new ProcessBuilder(compileCommand);
            compileBuilder.redirectErrorStream(true);
            Process compileProcess = compileBuilder.start();

            BufferedReader compileOutputReader = new BufferedReader(new InputStreamReader(compileProcess.getInputStream()));
            StringBuilder compileOutput = new StringBuilder();
            String compileLine;
            while ((compileLine = compileOutputReader.readLine()) != null) {
                compileOutput.append(compileLine).append("\n");
            }
            int compileExitCode = compileProcess.waitFor();
            if (compileExitCode != 0) {
                return compileOutput.toString();
            }

            ProcessBuilder runBuilder = new ProcessBuilder(outputExecutablePath);
            runBuilder.redirectErrorStream(true);
            Process runProcess = runBuilder.start();

            BufferedReader runOutputReader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            StringBuilder runOutput = new StringBuilder();
            String runLine;
            while ((runLine = runOutputReader.readLine()) != null) {
                runOutput.append(runLine).append("\n");
            }
            runProcess.waitFor();

            return runOutput.toString();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Error during compilation or execution: " + e.getMessage();
        }
    }

    public static String compileAndRunCPlus(String compilerPath, String sourceCodePath, String outputExecutablePath) {
        try {
            List<String> compileCommand = new ArrayList<>();
            compileCommand.add(compilerPath);
            compileCommand.add("-o");
            compileCommand.add(outputExecutablePath);
            compileCommand.add(sourceCodePath);

            ProcessBuilder compileBuilder = new ProcessBuilder(compileCommand);
            compileBuilder.redirectErrorStream(true);
            Process compileProcess = compileBuilder.start();

            BufferedReader compileOutputReader = new BufferedReader(new InputStreamReader(compileProcess.getInputStream()));
            StringBuilder compileOutput = new StringBuilder();
            String compileLine;
            while ((compileLine = compileOutputReader.readLine()) != null) {
                compileOutput.append(compileLine).append("\n");
            }
            int compileExitCode = compileProcess.waitFor();
            if (compileExitCode != 0) {
                System.err.println("Compilation error: " + compileOutput.toString());
                return compileOutput.toString();
            }

            List<String> runCommand = new ArrayList<>();
            runCommand.add(outputExecutablePath);

            ProcessBuilder runBuilder = new ProcessBuilder(runCommand);
            runBuilder.redirectErrorStream(true);
            Process runProcess = runBuilder.start();

            BufferedReader runOutputReader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            StringBuilder runOutput = new StringBuilder();
            String runLine;
            while ((runLine = runOutputReader.readLine()) != null) {
                runOutput.append(runLine).append("\n");
            }
            runProcess.waitFor();

            return runOutput.toString();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Error during compilation or execution: " + e.getMessage();
        }
    }


}
