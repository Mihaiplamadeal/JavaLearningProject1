package md.tekwillacademy.filemanagementservice;

import java.io.*;
import java.nio.file.Files;
import java.sql.SQLOutput;

public class InputFileReadManager {
    public static void printDataInTheConsoleUsingFileReader(File file){
        FileReader fileReaderObject =null;
        try {
            fileReaderObject = new FileReader(file);
            int charNumberInAsciiSystem;
            while ((charNumberInAsciiSystem = fileReaderObject.read()) != -1){
                System.out.print((char)charNumberInAsciiSystem);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found, the procedure is aborted");
        } catch (IOException e) {

            e.printStackTrace();
            System.out.print("There is a problem with read process");
        }finally {
            try {
                fileReaderObject.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
    public static void printDataFromAFileUsingBufferedReader(File file){
        FileReader fileReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            String line;

            while ((line = bufferedWriter.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Exception has occurred, skip the reading");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
    public static void printDataUsingTheEasiestWay(File file){
        try {
            String content = Files.readString(file.toPath());
            System.out.printf(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
