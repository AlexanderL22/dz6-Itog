import java.util.ArrayList;
import java.util.Scanner;

public class dz {
    public static int userInput(String msg){
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }
    public static String userSInput(String msg){
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = sc.nextLine();
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }


    public static void main(String[] args) {
        Laptop Huawei1 = new Laptop("Huawei","8", "256", "Linux", "Black");
        Laptop Asus1 = new Laptop("Asus","16", "256", "Windows 10", "White");
        Laptop Apple1 = new Laptop("Apple M1", "32", "1024", "Mac OS", "Silver");
        Laptop Acer1 = new Laptop("Acer", "16", "512", "DOS", "Grey");
        Laptop Samsung1 = new Laptop("Samsung", "4", "128", "DOS", "Grey");
        Laptop DEXP1 = new Laptop("DEXP", "8", "512", "Windows 8", "Black");
        Laptop IRBIS1 = new Laptop("IRBIS", "4", "128", "Windows 7", "Grey");
        Laptop Lenovo1 = new Laptop("Lenovo", "32", "2048", "Windows 11", "White");
        Laptop MSI1 = new Laptop("MSI", "64", "2048", "Windows 11", "Grey");

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(Acer1);
        laptops.add(Huawei1);
        laptops.add(Apple1);
        laptops.add(Asus1);
        laptops.add(Samsung1);
        laptops.add(DEXP1);
        laptops.add(IRBIS1);
        laptops.add(Lenovo1);
        laptops.add(MSI1);

        int numPoisk = userInput("Выберите критерии параметры сортировки:\n 1 - сортировка по марке, \n 2 - сортировка по оперативной памяти," +
                " \n 3 - сортировка по размеру SSD, \n 4 - сортировка по операционной системе, \n 5 - сортировка по цвету, \n 6 - показать весь список ");

        if (numPoisk == 6){
            for (Laptop laptop: laptops) {
                laptop.printInfo();
                System.out.println();
            }
        }

        else if (numPoisk == 1){
            String numParametr = userSInput("Выберите интресующий бренд");
            for (Laptop brand : laptops) {
                if (brand.getBrand().equalsIgnoreCase(numParametr)) {
                    System.out.println(brand.printInfo());
                }
            }
        }

        else if (numPoisk == 2){
            String numParametr = userSInput("Выберите размер ram: ");
            for (Laptop ram : laptops) {
                if (ram.getRam().equalsIgnoreCase(numParametr)) {
                    System.out.println(ram.printInfo());
                }
            }
        }

        else if (numPoisk == 3){
            String numParametr = userSInput("Выберите размер SSD: ");
            for (Laptop ssd : laptops) {
                if (ssd.getSSD().equalsIgnoreCase(numParametr)) {
                    System.out.println(ssd.printInfo());
                }
            }
        }

        else if (numPoisk == 4){
            String numParametr = userSInput("Выберите интересующую операционную систему: ");
            for (Laptop os : laptops) {
                if (os.getOs().equalsIgnoreCase(numParametr)) {
                    System.out.println(os.printInfo());
                }
            }
        }

        else if (numPoisk == 5){
            String numParametr = userSInput("Выберите интересующий цвет: ");
            for (Laptop color : laptops) {
                if (color.getColor().equalsIgnoreCase(numParametr)) {
                    System.out.println(color.printInfo());
                }
            }
        }

    }
}
