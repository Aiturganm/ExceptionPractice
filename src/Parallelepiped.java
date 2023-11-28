public class Parallelepiped {
    public static double areaP(double height, double length, double width){
        return (2*(height*length) + (length*width) + height*width);
    }

    public static double volumeP(double height, double length, double width){
        return (length*width*height);
    }
}
