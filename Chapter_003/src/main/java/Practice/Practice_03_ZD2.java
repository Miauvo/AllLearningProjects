package Practice;

import java.util.Scanner;

public class Practice_03_ZD2 {

    public Practice_03_ZD2(){
        System.out.println("\n\u001B[34m Задание 2:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("Размерность массива=");
        int n = sc.nextInt();
        System.out.println("Введите елементы массива (int)=");
        int array[] = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("array["+i+"] =");
           array[i] = sc.nextInt();
        }
        System.out.println("-----------------");
        for (int i = n-1; i >= 0; i--) {
            System.out.print("["+array[i]+"]");
        }
        System.out.println("\n-----------------");
    }
}
