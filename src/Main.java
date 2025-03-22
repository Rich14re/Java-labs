public class Main {
    public static void main(String[] args) {
        boolean exit = false;

        System.out.println("Введите путь к файлу: ");
        String path = System.console().readLine();

        if (path == null || path.isEmpty()) {
            System.out.println("путь к файлу пуст.");
            System.out.println("Завершение программы...");
            exit = true;
        }

        FileHandler frd = new FileHandler(path);

        while(!exit){
            System.out.println("Введите команду: ");
            System.out.println("1. Прочесть файл");
            System.out.println("2. Записать строку");
            System.out.println("3. Завершить программу");

            String command = System.console().readLine();

            switch (command){
                case "1":
                    frd.readFile(); //чтение файлa
                    break;
                case "2":
                    String str_to_wr = System.console().readLine();
                    frd.writeStringInFile(str_to_wr); //запись
                    break;
                case "3":
                    exit = true;
                    break;
            }
        }
    }
}