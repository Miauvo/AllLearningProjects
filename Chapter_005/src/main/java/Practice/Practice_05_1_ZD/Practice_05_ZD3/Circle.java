package Practice.Practice_05_1_ZD.Practice_05_ZD3;

class Circle {
    double radius;
    Point point;

    boolean collisionCheck(Circle otherCircle){
        double eps =0.001; //погрешность
        double d=this.point.calcLength(otherCircle.point);
        if (d>(radius+otherCircle.radius))
            return false;
        else
            return true;
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.point = new Point(x,y);
    }

    public Circle(double radius, Point point) {
        this.radius = radius;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +" "+
                point +
                '}';
    }
}


