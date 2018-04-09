package HW;

public class HW_04_ZD4 {
    public void getMax (int x, int y)
    {
        System.out.format("INT: x = %d, y = %d%n",x,y);
        getMax((double) x,(double) y);
    }

    public void getMax (float x, float y)
    {
        System.out.format("FLOAT: x = %.2f, y = %.2f%n",x,y);
        getMax((double) x,(double)y);
    }

    public void getMax(double x, double y){
        if(x>y) System.out.println("x > y");
        else if(x<y) System.out.println("x < y");
        else System.out.println("x == y");
    }

    public HW_04_ZD4() {
        System.out.println("\n\u001B[34m Задание 4:\u001B[0m");
        getMax(2,10);
        getMax(2.2f,10.9f);



    }
}
