import java.io.*;

public class FileHandler {
    String f_path;
    File file;
    FileReader fr;

    public FileHandler(String f_name){
        f_path = f_name;
    }

    public String readFile() {
        try {
            file = new File(f_path);
            if(!file.exists()){
                System.out.println("файл не найден. создание файла...");
                file.createNewFile();
            }
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    public void writeStringInFile(String str_to_write) {
        if(str_to_write == null || str_to_write.isEmpty()){
            System.out.println("пустое слово.");
            return;
        }

        try(FileWriter writer = new FileWriter(f_path, true))
        {
            writer.write("\n" + str_to_write);
            writer.flush();
        } catch (IOException e) {
            System.out.println("ошибка при записи: " + e.getMessage());
        }
    }
}
