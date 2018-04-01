package HW;

import java.util.Scanner;

public class HW_02_ZD1 {
    public HW_02_ZD1() {
        Scanner sc = new Scanner(System.in);


//        System.out.println("Имя");
//        String name = sc.nextLine();
//        System.out.println("Город проживания");
//        String city = sc.nextLine();
//        System.out.println("Возраст");
//        int age = sc.nextInt();
//        System.out.println("Хобби ");
//        String hobbies = sc.nextLine();


        System.out.println("Имя");
        String name = "Кузя";
        System.out.println("Город проживания");
        String city = "Мультиленд";
        System.out.println("Возраст");
        int age = 2;
        System.out.println("Хобби ");
        String hobbies = "Вредничать";

        System.out.print("Выберите способ вывода информации:\n" +
                "---------------------------------\n" +
                "Вариант 1 (табличный):\n" +
                "Имя:               хххххх\n" +
                "Город:            хххххх\n" +
                "Возраст:        хххххх\n" +
                "Хобби:           хххххх\n" +
                "----------------------------------\n" +
                "Вариант 2 (текстовый):\n" +
                "Человек по имени хххххх живет в городе хххххх.\n" +
                "Этому человеку хххххх лет и любит он заниматься хххххх.\n" +
                "----------------------------------\n" +
                "Вариант 3 (иной):\n" +
                "хххххх - имя\n" +
                "хххххх - город\n" +
                "хххххх - возраст\n" +
                "хххххх - хобби\n" +
                "----------------------------------" +
                "\nВаш выбор:");
        int choise = sc.nextInt();

        String format;
        switch (choise)
        {
            case 1:
                format = String.format(  "---------------------------------%n" +
                        "Вариант 1 (табличный):%n" +
                        "Имя:\t%s%n" +
                        "Город:\t%s%n" +
                        "Возраст:\t%d%n" +
                        "Хобби:\t%s%n" +
                        "----------------------------------%n",name,city,age,hobbies);
                break;
            case 2:
                format = String.format( "----------------------------------%n" +
                        "Вариант 2 (текстовый):%n" +
                        "Человек по имени %s живет в городе %s.%n" +
                        "Этому человеку %d лет и любит он заниматься %s.%n" +
                        "----------------------------------%n",name,city,age,hobbies);
                break;
            case 3:
                format = String.format("----------------------------------%n" +
                        "Вариант 3 (иной):%n" +
                        "%s - имя%n" +
                        "%s - город%n" +
                        "%d - возраст%n" +
                        "%s - хобби%n" +
                        "----------------------------------",name,city,age,hobbies);
                break;
            default: format=String.format("");return;
        }

        System.out.format(format);
    }
}
