package practice;

import java.util.Scanner;

public class Practice_02_ZD9 {

    String line1;
    String line2;
    int number;
    StringBuffer rez;

    public Practice_02_ZD9() {
        System.out.println("\n\u001B[34m Задание 9 (Доп.):\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("First line  (Например: aaaaaaa):");
        line1=sc.nextLine();
        System.out.print("Second line: (Например: 00)");
        line2 =sc.nextLine();
        System.out.print("Number: (Например: 3)");
        number= sc.nextInt();
        rez= new StringBuffer(line1);
        if (number>0)
            rez.insert(number-1,line2);
        System.out.println("REZ = " + rez);
    }
}
