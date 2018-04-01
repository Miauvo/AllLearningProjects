package practice;

import java.util.Scanner;

public class Practice_02_ZD1 {
    public Practice_02_ZD1(){
        System.out.println("\n\u001B[34m Задание 1:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("A (Например: 4)=");
        double A = sc.nextDouble();
        System.out.print("B (Например: 2)=");
        double B = sc.nextDouble();
        double X = A + B;
        System.out.format("%.2f + %.2f = %.2f%n",A,B,X);
    }
}
