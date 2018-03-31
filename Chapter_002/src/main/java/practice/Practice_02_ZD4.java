package practice;

import java.util.Scanner;

public class Practice_02_ZD4 {
    public Practice_02_ZD4(){
        System.out.println("\n\u001B[34m Задание 4:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("A=");
        int A = sc.nextInt();
        System.out.print("B=");
        int B =sc.nextInt();
        System.out.format("%d равно %d? %b%n",A,B,A==B);
        System.out.format("%d делиться на %d без остатка? %b%n",A,B,(A%B)==0);
        System.out.format("%d больше чем %d ? %b%n",A,B,A>B);
    }
}
