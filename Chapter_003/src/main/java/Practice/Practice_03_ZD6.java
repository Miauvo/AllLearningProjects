package Practice;

import java.util.Scanner;

public class Practice_03_ZD6 {

    public Practice_03_ZD6(){
        System.out.println("\n\u001B[34m Задание 6:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ширина =");
        int n = sc.nextInt();
        System.out.print("Высота =");
        int m = sc.nextInt();
        int array[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0||i==(m-1)||j==(n-1))
                    array[i][j]=-100;
                else
                    array[i][j]=  (int)((Math.random() * (1010-1000) ) + 1000);// Math.random()*1000-1000
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("\n-----------------");
    }
}
