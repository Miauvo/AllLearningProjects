package practice;

import java.util.Scanner;

public class Practice_02_ZD2 {
    public Practice_02_ZD2(){
        System.out.println("\n\u001B[34m Задание 2:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("ширина прямоугольника (см) =");
        double a = sc.nextDouble();
        System.out.print("высота прямоугольника (см) =");
        double b = sc.nextDouble();
        double area = a * b;
        System.out.format("площадь прямоугольника = %.2f%n",area);
    }
}
