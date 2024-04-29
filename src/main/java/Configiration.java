public class Configiration {

    //variables
    private String language;
    private String filePath;
    private String[] commands ;
    private String projectName ;
    private String output;
    //private String compilerPath;


    //setter-getter
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
    /*public String getCompilerPath() {
        return compilerPath;
    }

    public void setCompilerPath(String filePath) {
        this.compilerPath = compilerPath;
    }*/

    //constructor
    public Configiration(String language, String filePath, String[] commands, String projectName, String output) {
        this.language = language;
        this.filePath = filePath;
        this.commands = commands;
        this.projectName = projectName;
        this.output = output;
    }


}
