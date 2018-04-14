package Practice.Practice_05_ZD2;

import java.text.DecimalFormat;

class Point {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

     @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return  "{" +
                "x=" + df.format(this.x) +
                ", y=" + df.format(this.y) +
                '}';
    }

    public float calcLength(Point otherPoint){
        return (float)Math.sqrt(Math.pow(otherPoint.x-this.x,2)+Math.pow(otherPoint.y-this.y,2));
    }

}