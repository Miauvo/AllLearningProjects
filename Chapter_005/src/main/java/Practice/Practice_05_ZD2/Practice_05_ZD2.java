package Practice.Practice_05_ZD2;

import java.util.Scanner;

public class Practice_05_ZD2 {

    public Practice_05_ZD2(){
        System.out.println("\n\u001B[34m Задание 2:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты центра первого круга:");
        System.out.print("x (Напр.: 5.6) = ");
        double x = sc.nextDouble();
        System.out.print("y (Напр.: 5.6) = ");
        double y = sc.nextDouble();
        System.out.println("Введите радиус (Напр.10.2):");
        double r = sc.nextDouble();
        Circle A = new Circle(r,x,y);
        System.out.println("A = " + A);
        System.out.println("Введите координаты центра второго круга:");
        System.out.print("x (Напр.: 8.9) = ");
        x = sc.nextDouble();
        System.out.print("y (Напр.: 10.6) = ");
        y = sc.nextDouble();
        System.out.println("Введите радиус (Напр.5.1):");
        r = sc.nextDouble();
        Circle B = new Circle(r,x,y);
        System.out.println("B = " + B);
        System.out.println("Введите радиус (Напр.10.2):");
        System.out.println("Один круг сталкивается с другим?  "+ A.collisionCheck(B));


    }
}
