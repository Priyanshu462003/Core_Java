package METHODOVERLOADING;

public class Area {

    static double area(double l,double b)
    {

        return l*b;
    }
    static double area(double r)
    {
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        double l=2.0f,b=5.0f;
        double r=2.0f;
        double m=area(r);
        double k=area(l,b);
        System.out.println(k+" is area of rectangle");
        System.out.println(m+" is area of circle");
    }
}


