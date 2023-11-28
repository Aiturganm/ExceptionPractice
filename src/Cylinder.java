import static java.lang.Math.PI;

public class Cylinder {
    public static void methodC(double radius, double height){
        double area = (2*PI * radius*( height + radius));
        System.out.println("Area of Cylinder: " + area);
        double volume = (PI*radius*radius*height);
        System.out.println("Volume of Cylinder: " + volume);
    }

}
