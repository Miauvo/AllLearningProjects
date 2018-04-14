package Practice.Practice_05_ZD3;


import java.util.ArrayList;
import java.util.Arrays;

public class CircleGenerator {
    ArrayList<Circle> ar;
    void generate(int countOfCircles){
        ar = new ArrayList<Circle>();
        for (int i = 0; i < countOfCircles; i++) {
            ar.add(new Circle(Math.random()*100,Math.random()*100,Math.random()*100));
        }
        System.out.println("Колличество кругов: " + ar.size());
    }
   int calcCountOfCollisions(){
        if (ar == null) return 0;
        int count=0;
       for (Circle c1: ar) {
           for (Circle c2:ar) {
               if (c1.collisionCheck(c2))
                    count++;
           }
       }
       return count;
   }

    @Override
    public String toString() {
       String [] s =  new String[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            s[i] = ar.get(i).toString();
        }
        return "CircleGenerator{" +
                Arrays.toString(s) +
                '}';
    }
}
