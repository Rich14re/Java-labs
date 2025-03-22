public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Shape cylinder = new Cylinder(6,6,6);
        Shape pyramid = new Pyramid(3,4,4);
        Shape sec_pyramid = new Pyramid(4,4,4);

        System.out.println(box.getVolume());

        boolean isCylAdded = box.Add(cylinder);
        boolean isPyrAdded = box.Add(pyramid);
        boolean isSecPyrAdded = box.Add(sec_pyramid);
        if(isCylAdded){
            System.out.println("цилиндр добавлен");
        }
        else{
            System.out.println("цилиндр не добавлен");
        }
        if(isPyrAdded){
            System.out.println("первая пирамида добавлена");
        }
        else{
            System.out.println("1 пир не добавлена");
        }
        if(isSecPyrAdded){
            System.out.println("вторая пирамида добавлена");
        }
        else{
            System.out.println("2 пир не добавлена");
        }

    }
}
