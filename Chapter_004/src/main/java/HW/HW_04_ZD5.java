package HW;

import java.util.Scanner;

public class HW_04_ZD5 {
    public void ZD5(int X)
    {
        if (X--!=0){
            ZD5(X);
        }
        System.out.print(X+1 + "\t");
    }


    public HW_04_ZD5() {
        System.out.println("\n\u001B[34m Задание 5:\u001B[0m");
        Scanner sc = new Scanner(System.in);

        System.out.print("X (Напр.:5)=");
        int X = sc.nextInt();
        ZD5(X);

    }
}
