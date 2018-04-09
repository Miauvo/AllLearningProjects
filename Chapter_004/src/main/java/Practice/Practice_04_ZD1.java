package Practice;

import java.util.Arrays;

public class Practice_04_ZD1 {
    int indexMax(int[]array){
        System.out.println("first function:");
        int index=0;
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]){
                max=array[i];
                index=i;
            }
        }
        return index;
    }

    int index(int []array){
        System.out.print("second function:\n\t");
        return array[indexMax(array)];
    }


    public Practice_04_ZD1(){
        System.out.println("\n\u001B[34m Задание 1:\u001B[0m");
        int n= (int) ((Math.random()*(20-5))+5);
        int array[] =new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= (int)(Math.random()*(50-10)+10);
        }
        System.out.format(Arrays.toString(array)+"\n");
        System.out.println("index = " + indexMax(array));
        System.out.println("element = " + index(array));
    }
}
