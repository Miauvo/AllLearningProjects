package Practice;

import java.util.Scanner;

public class Practice_03_ZD5 {

    public Practice_03_ZD5(){
        System.out.println("\n\u001B[34m Задание 3:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ширина =");
        int n = sc.nextInt();
        System.out.print("Высота =");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        System.out.println("\n-----------------");
    }
}
