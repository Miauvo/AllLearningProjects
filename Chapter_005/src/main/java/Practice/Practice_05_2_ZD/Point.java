package Practice.Practice_05_2_ZD;

public class Point {
    private static Point ZERO;
    private double x;
    private double y;

    public double calcLength(Point otherPoint){
        return (float)Math.sqrt(Math.pow(otherPoint.x-this.x,2)+Math.pow(otherPoint.y-this.y,2));
    }

    public double calcLength(){
        return calcLength(ZERO);
    }
    
}
