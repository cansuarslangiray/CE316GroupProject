package com.example.CE316GroupProjet;

import java.util.Arrays;

public class Configiration {

    //variables
    private String language;  //c,java etc
    private String filePath;  // projenin yolu
    private String[] commands ; //java için javac , c nin css gibi onların compiler ı
    private String projectName ;  // projenin adı
    private String output;  // projenin çıktısı
    private String configName;
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


    public void setConfigName(String configName) {
        this.configName = configName;
    }


    public String getConfigName() {
        return configName;
    }
    //constructor


    public Configiration(String language, String filePath, String[] commands, String projectName, String output, String configName) {
        this.language = language;
        this.filePath = filePath;
        this.commands = commands;
        this.projectName = projectName;
        this.output = output;
        this.configName = configName;
    }


    @Override
    public String toString() {
        return "Configiration{" +
                "language='" + language + '\'' +
                ", filePath='" + filePath + '\'' +
                ", commands=" + Arrays.toString(commands) +
                ", projectName='" + projectName + '\'' +
                ", output='" + output + '\'' +
                ", configName='" + configName + '\'' +
                '}';
    }
}
