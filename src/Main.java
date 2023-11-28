import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                1. Параллелепипед
                2. Цилиндр
                """);
        switch (new Scanner(System.in).nextLine().toLowerCase()){
            case "1", "параллелепипед" : {
                    try {
                        System.out.println("Enter height: ");
                        double h = new Scanner(System.in).nextDouble();
                        if (h > 0) {
                            System.out.println("Enter length: ");
                            double l = new Scanner(System.in).nextDouble();
                            if (l > 0) {
                                System.out.println("Enter width: ");
                                double w = new Scanner(System.in).nextDouble();
                                if (w > 0) {
                                    System.out.println("Parallelepiped area: " + Parallelepiped.areaP(h, l, w));
                                    System.out.println("Parallelepiped volume: " + Parallelepiped.volumeP(h, l, w));
                                } else throw new MyException("Width must be greater than 0. ");
                            } else throw new MyException("Length must be greater than 0");
                        } else throw new MyException("Height must be greater than 0");
                    }
                    catch (MyException e){
                        System.out.println(e.getMessage());

            }


                break;
            }


            case "2", "цилиндр": {
                try {
                    System.out.println("Enter radius: ");
                    double r = new Scanner(System.in).nextDouble();
                    if (r > 0) {
                        System.out.println("Enter height: ");
                        double h = new Scanner(System.in).nextDouble();
                        if (h > 0) {
                               Cylinder.methodC(r, h);
                        } else throw new MyException("Height must be greater than 0");
                    } else throw new MyException("Radius must be greater than 0");
                }catch (MyException e){
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }
}