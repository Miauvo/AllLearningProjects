package HW;

import java.util.Arrays;
import java.util.Scanner;

public class HW_05_ZD1 {
    public HW_05_ZD1() {
        System.out.println("\n\u001B[34m Задание 1:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("Размерность массива (Рекомендую до 10)=");
        int n = sc.nextInt();
        System.out.println("Введите елементы массива (int, и с повторами)=");
        int array[] = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("array["+i+"] =");
            array[i] = sc.nextInt();
        }
        System.out.println("-----------------");
        int min=array[0];
        int max=array[0];
        int col = 0;
        for (int i = n-1; i >= 0; i--) {
            if(min>array[i]){
                min=array[i];
            }
            if(max<array[i]){
                max=array[i];
            }
            if(array[i]==5){
                col++;
            }
            System.out.print("["+array[i]+"]");
        }
        System.out.println("\n-----------------");

        System.out.println("-----------------");
        System.out.println("Минимальное число: "+min);
        System.out.println("Максимальное число: "+max);
        System.out.println("Количество повторений числа 5: "+col);
        Arrays.sort(array);
        System.out.println("Отсортированный масив: " + Arrays.toString(array));

    }
}
