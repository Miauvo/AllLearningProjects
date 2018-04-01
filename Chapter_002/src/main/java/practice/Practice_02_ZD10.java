package practice;

import java.util.Scanner;

public class Practice_02_ZD10 {

    String line1;
    String line2;


    public Practice_02_ZD10() {
        System.out.println("\n\u001B[34m Задание 10 (Доп.):\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("First line (Например: ddaaaaaaa):");
        line1=sc.nextLine();
        System.out.print("Second line: (Например:aa)");
        line2 =sc.nextLine();
        System.out.format("встречается ли вторая введенная строка в первой? %b%n", line1.contains(line2));
        line1 = line1.toLowerCase();
        line2 = line2.toLowerCase();
        int i = line1.indexOf(line2);
        int count = 0;
        while (i >= 0) {
            count++;
            i = line1.indexOf(line2, i + 1);
        }
        System.out.format("сколько раз встречается вторая строка в первой? %d%n",count);
        System.out.format("в каком месте вторая строка встречается первый раз в первой? %d%n",line1.indexOf(line2)+1);
        System.out.println();

    }
}
