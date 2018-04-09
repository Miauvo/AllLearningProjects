package Practice;

import java.util.Scanner;

public class Practice_04_ZD2 {

    public long pow(int x,int n){
        long rez=1;
        if (n-->0){
            rez = pow(x,n)*x;
        }
        return rez;
    }
    public Practice_04_ZD2(){
        System.out.println("\n\u001B[34m Задание 2:\u001B[0m");
        Scanner sc = new Scanner(System.in);

        System.out.print("Число X (Напр.:2) = ");
        int X = sc.nextInt();
        System.out.print("Степень N (Напр.:8) = ");
        int N = sc.nextInt();
        System.out.println("Rez = " + pow(X,N));}

}
