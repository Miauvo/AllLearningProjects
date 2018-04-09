package HW;

import java.util.Scanner;

public class HW_04_ZD1 {
    public void ZD1(int X)
    {
        for(int i=0; i<=Math.abs(X); i++)
            System.out.print(i + "\t");
    }

    public HW_04_ZD1() {
        System.out.println("\n\u001B[34m Задание 1:\u001B[0m");
        Scanner sc = new Scanner(System.in);

        System.out.print("Число X (Напр.:12) = ");
        int X = sc.nextInt();
        ZD1(X);

    }
}
