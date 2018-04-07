package HW;

import java.util.Arrays;
import java.util.Scanner;

public class HW_03_ZD2 {
    public HW_03_ZD2() {
        System.out.println("\n\u001B[34m Задание 2:\u001B[0m");
        Scanner sc = new Scanner(System.in);
        System.out.print("Размерность массива (Рекомендую до 10)=");
        int n = sc.nextInt();
        System.out.println("Введите елементы массива  (int, и с повторами) =");
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
        int cols [][] = new int[n+1][2];

        int sum;
        int index=array.length-1;
        int znach;
        int g=0;
        boolean flag=false;
        while (true){
            sum=0;
            znach=array[index];
            if (index==0)flag=true;
            do{

                sum++;
            }
            while ((index!=0)&&(array[index]==array[--index]));
            cols[g][0]= znach;
            cols[g][1]= sum;
            g++;
            if(flag)break;
        }

        cols = Arrays.copyOfRange(cols,0,g);
        for (int i = 0; i <cols.length; i++) {
            System.out.println(Arrays.toString(cols[i]));
        }

        System.out.println("Отсортированный масив: " + Arrays.toString(array));

    }
}
