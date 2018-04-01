package practice;

import java.util.Scanner;

public class Practice_02_ZD5 {
    public Practice_02_ZD5(){
        System.out.println("\n\u001B[34m Задание 5:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("A (Например: 12)=");
        int A = sc.nextInt();
        System.out.print("B (Например: 40)=");
        int B =sc.nextInt();
        System.out.print("C (Например: 9) =");
        int C =sc.nextInt();
        System.out.format("является ли A наибольшим числом? %b%n",  (A>B&&A>C));
        System.out.format("является ли B наибольшим числом? %b%n",  (B>A&&B>C));
        System.out.format("является ли C наибольшим числом? %b%n%n",(C>B&&C>A));
        System.out.format("является ли A наименьшим числом? %b%n",  (A<B&&A<C));
        System.out.format("является ли B наименьшим числом? %b%n",  (B<A&&B<C));
        System.out.format("является ли C наименьшим числом? %b%n%n",(C<B&&C<A));
        System.out.format("является ли A промежуточным числом между B и C? %b%n",(A>B&&C>A));
        System.out.format("является ли B промежуточным числом между A и C? %b%n",(B>A&&C>B));
        System.out.format("является ли C промежуточным числом между A и B? %b%n",(C>A&&C<B));

    }
}
