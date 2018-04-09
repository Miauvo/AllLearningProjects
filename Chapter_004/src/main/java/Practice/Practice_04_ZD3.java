package Practice;

import java.util.Scanner;

public class Practice_04_ZD3 {

    public void AB(int a,int b){
        System.out.print(a+"\t");

        if (a<b){
            AB(++a,b);
        }

    }
    public Practice_04_ZD3() {
        System.out.println("\n\u001B[34m Задание 3:\u001B[0m");
        Scanner sc = new Scanner(System.in);

        System.out.print("Число A (Напр.:2) = ");
        int A = sc.nextInt();
        System.out.print("Число B>A (Напр.:8) = ");
        int B = sc.nextInt();
        AB(A, B);
        System.out.println();
    }
}
