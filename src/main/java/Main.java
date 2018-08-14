import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите объекты(кепки - 1 или футболки - 2: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String obj = str;

        System.out.println("Введите, через пробел, количество вводимых объектов и объекты(кепки - 1 или футболки - 2: ");
        str = scan.nextLine();
        String[] subStr;
        String delimeter = " "; // Разделитель
        subStr = str.split(delimeter); // Разделения строки str с помощью метода split()

        int count = Integer.parseInt(subStr[0]);


        if (Integer.parseInt(subStr[1]) == 1) {
            Caps caps = new Caps(count);

        } else if (Integer.parseInt(subStr[1]) == 2){
            Shirts shirts = new Shirts();
        } else {
            System.out.println("Неверно введено число");
        }

//        for (int i = 0; i < count; i++) {
//            System.out.println("Введите название:");
//
//            System.out.println("Введите цену:");
//
//            System.out.println("Введите количество:");
//
//            System.out.println("Введите фирму:");
//        }
    }
}
