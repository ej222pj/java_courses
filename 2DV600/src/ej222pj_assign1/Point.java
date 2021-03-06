/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1
 * 
 * @file_name Point.java
 */
package ej222pj_assign1;

/**
 * @author Eric
 *
 * @date 6 sep 2016 : @time 16:20:57
 *
 */
public class Point {
		int x, y;

    public static void main(String args[])
    {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        if (p1.isEqualTo(p2))              // False!
            System.out.println("The two points are equal");

        double dist = p1.distanceTo(p2);
        System.out.println("Point Distance: "+dist);

        p2.move(5,-2);         // ==> (8,2)
        p1.moveToXY(8,2);      // ==> (8,2)

        if (p1.isEqualTo(p2))              // True!
            System.out.println("The two points are equal");
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return ("(" + this.x + "," + this.y +")");
    }
    
    public double distanceTo(Point secondPoint){
        return Math.sqrt((this.x-secondPoint.x)*(this.x-secondPoint.x) + (this.y-secondPoint.y)*(this.y-secondPoint.y));
    }
    
    public boolean isEqualTo(Point secondPoint){
        return this.x == secondPoint.x && this.y == secondPoint.y;
    }

    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void moveToXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}