import com.google.gson.Gson;
import javafx.fxml.FXML;

import java.io.*;

public class Controller {

    private static Configiration readJsonFile(String filePath) {
        try (FileReader fileReader = new FileReader(filePath)) {
            return new Gson().fromJson(fileReader, Configiration.class);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Creating a new object.");
            return new Configiration();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @FXML // arayüzdeki createConfigiration butonu ile aktifleşecek
    public void createConfig(){
        Gson gson = new Gson();

        //ceren guiyi yaptıktan sonra bu kısım aktifleşecek id isimlendirmesinden sonra
        String language=languageid.getText(); //text fieldden veri gelecek id sine göre
        String fPath=filePathid.getText(); //text fieldden veri gelecek id sine göre
        String[] commands =commandsid.getText(); //text fieldden veri gelecek id sine göre
        String projectName= projectNameid.getText(); //text fieldden veri gelecek id sine göre
        String output=outputid.getText(); //text fieldden veri gelecek id sine göre
        String configName=configNameid.getText();

        Configiration config=new Configiration(language,fPath,commands,projectName,output,configName);

        String newJson = gson.toJson(config);

        //Create new directory according to course code
        String newFileName=configName+".json";
        File file = new File(directory,newFileName);  // directory nimet tarafından yapılacak, file pathte aynı şekkilde
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(newJson);
            System.out.println("JSON written to file successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML  //edit configiration sahnesi açıldıktan sonra edit butonu ile aktifleşecek
    public void openConfig(String filePath){  // also edit can do from there

        //sahne geçişi buraya yazılacak
        // açılır bir liste içerisinde tüm configirasyonlar listelenecek ardından seçildikten sonra


        Configiration config=readJsonFile(filePath);
        languageid.setText(config.getLanguage()); //text fieldden veri gelecek id sine göre
        filePathid.setText(config.getFilePath()); //text fieldden veri gelecek id sine göre
        commandsid.setText(config.getCommands()); //text fieldden veri gelecek id sine göre
        projectNameid.setText(config.getProjectName()); //text fieldden veri gelecek id sine göre
        outputid.setText(config.getOutput()); //text fieldden veri gelecek id sine göre


        //show scene olacak

    }

    @FXML
    public void editButton(ActionEvent event) throws IOException {
        File file=new File(filePath);
        file.delete();  // daha sonra yazılacak
        createConfig();
    }

    String filePath;

}
