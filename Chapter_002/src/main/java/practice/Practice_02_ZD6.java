package practice;

import java.util.Scanner;

public class Practice_02_ZD6 {
    public Practice_02_ZD6(){
        System.out.println("\n\u001B[34m Задание 6:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("A (Например: 100)=");
        int A = sc.nextInt();
        System.out.print("B (Например: 100)=");
        int B =sc.nextInt();
        System.out.print("C (Например: 50)=");
        int C =sc.nextInt();
        System.out.format("равняется ли A хотя бы одному из других чисел? %b%n",  (A==B||A==C));
        System.out.format("равняется ли B хотя бы одному из других чисел? %b%n",  (B==A||B==C));
        System.out.format("равняется ли C хотя бы одному из других чисел? %b%n%n",(C==B||C==A));
        System.out.format("A больше хотя бы одного из других чисел? %b%n",  (A>B||A>C));
        System.out.format("B больше хотя бы одного из других чисел? %b%n",  (B>A||B>C));
        System.out.format("C больше хотя бы одного из других чисел? %b%n%n",(C>B||C>A));

    }
}
