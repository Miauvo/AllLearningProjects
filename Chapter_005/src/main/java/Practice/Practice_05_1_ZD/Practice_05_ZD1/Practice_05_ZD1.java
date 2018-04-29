package Practice.Practice_05_1_ZD.Practice_05_ZD1;

import java.util.Scanner;



public class Practice_05_ZD1 {
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

    public Practice_05_ZD1(){
        System.out.println("\n\u001B[34m Задание 1:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки А:");
        System.out.print("x (Напр.: 5.6) = ");
        float x = sc.nextFloat();
        System.out.print("y (Напр.: 5.6) = ");
        float y = sc.nextFloat();
        Point A = new Point(x,y);
        System.out.println(A);
        System.out.println("Введите координаты точки B:");
        System.out.print("x (Напр.: 8.9) = ");
        x = sc.nextFloat();
        System.out.print("y (Напр.: 10.6) = ");
        y = sc.nextFloat();
        Point B = new Point(x,y);
        System.out.println(B);
        System.out.println("Длина отрезка:" + A.calcLength(B));

    }
}
