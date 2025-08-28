import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



                Scanner input = new Scanner(System.in);

                try {
                    System.out.print("Enter three sides of triangle: ");
                    double s1 = input.nextDouble();
                    double s2 = input.nextDouble();
                    double s3 = input.nextDouble();

                    System.out.print("Enter color: ");
                    String color = input.next();

                    System.out.print("Is the triangle filled (true/false)? ");
                    boolean filled = input.nextBoolean();

                    Triangle t = new Triangle(s1, s2, s3);
                    t.setColor(color);
                    t.setFilled(filled);

                    System.out.println("\n--- Triangle Info ---");
                    System.out.println(t.toString());
                    System.out.println("Perimeter = " + t.getPerimeter());
                    System.out.println("Area = " + t.getArea());
                    System.out.println("Color = " + t.getColor());
                    System.out.println("Filled = " + t.isFilled());
                }
                catch (IllegalTriangleException e) {
                    System.out.println("Error: " + e.getmsg());
                }
            }
        }

