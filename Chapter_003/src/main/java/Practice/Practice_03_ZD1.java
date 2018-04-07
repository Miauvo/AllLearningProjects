package Practice;

import java.util.Scanner;

public class Practice_03_ZD1 {
    int ReverseInt(int A){
        int ANew=0;
        int i=0;
        while (A!=0)
        {
            ANew = (int)(ANew*10 + A%10) ;
            A=(int) (A/10);
            i++;
        }
        return ANew;
    }

    public Practice_03_ZD1(){
        System.out.println("\n\u001B[34m Задание 1:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число=");
        int A = sc.nextInt();
        System.out.print("Введите второе число=");
        int B = sc.nextInt();
     //   int A=123;int B=4246;
        A = ReverseInt(A);
        B = ReverseInt(B);

        System.out.format("Rez = %d\t%d%n",A,B);
    }
}
