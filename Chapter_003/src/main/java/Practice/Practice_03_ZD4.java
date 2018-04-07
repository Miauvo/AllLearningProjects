package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_03_ZD4 {

    public Practice_03_ZD4(){
        System.out.println("\n\u001B[34m Задание 3:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("Размерность массива A =");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Генерация елементов массива... Массив A:");
        for (int i = 0; i <n; i++) {
            A[i] = (int)(Math.random()*200-100);
        }
        System.out.println(Arrays.toString(A));
        Arrays.sort(A);
        System.out.println("Массив по возрастанию :");
        System.out.println(Arrays.toString(A));
        for (int i = 0; i < n/2; i++) {
            int x = A[i];
            A[i] = A[n-1-i];
            A[n-1-i]=x;
        }
        System.out.println("Массив по убыванию:");
        System.out.println(Arrays.toString(A));
        System.out.println("\n-----------------");
    }
}
