package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_03_ZD3 {

    public Practice_03_ZD3(){
        System.out.println("\n\u001B[34m Задание 3:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("Размерность массива A =");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Генерация елементов массива... Массив A:");
        for (int i = 0; i <n; i++) {
            A[i] = (int)(Math.random()*20-10);
        }
        System.out.println(Arrays.toString(A));

        System.out.print("Размерность массива B (желательно отличной от А) =");
        int m = sc.nextInt();
        int B[] = new int[m];
        System.out.println("Генерация елементов массива... Массив B:");
        for (int i = 0; i <m; i++) {
            B[i] = (int)(Math.random()*20-10);
        }
        System.out.println(Arrays.toString(B));

        int k=0;
        if(m>n) {
            k=m;
        } else {
            k=n;
        }

        int C[] = new int[k];
        for (int i = 0; i < k; i++) {
            if (m<=i){
                C[i] = A[i];
            }else if (n<=i){
                C[i] = B[i];
            }else{
                C[i] = A[i]+B[i];
            }
        }
        System.out.println("Массив C:");
        System.out.println(Arrays.toString(C));
        System.out.println("\n-----------------");
    }
}
