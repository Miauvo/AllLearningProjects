package practice;

import java.util.Scanner;

public class Practice_02_ZD3 {
    public Practice_02_ZD3(){
        System.out.println("\n\u001B[34m Задание 3:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("длина стороны a треугольника (см) =");
        double a = sc.nextDouble();
        System.out.print("длина стороны b треугольника (см) =");
        double b = sc.nextDouble();
        System.out.print("длина стороны c треугольника (см) =");
        double c = sc.nextDouble();
        double perimeter = a+b+c;
        double area = Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
        System.out.format("площадь треугольника = %.2f%n",area);
    }
}
