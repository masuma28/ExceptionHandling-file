public class Triangle extends Geometricobject {
    private double side1;
    private double side2;
    private double side3;
public Triangle ()throws IllegalTriangleException{
    this(1.0,1.0,1.0);
}
public Triangle(double side1,double side2,double side3)throws IllegalTriangleException {
    if (!isValid(side1, side2, side3)) {
        throw IllegalTriangleException("invalid sides :" + side1 + side2 + side3);
    }
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
}
// Accessors
public double getside1(){
 return side1; }
    public double getside2(){
        return side2; }
    public double getside3(){
        return side3; }
    public double getArea(){
    double s = getperimeter()/2.0;
    return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public String tostring(){
    return"Triangle : side1 =" + side1 + "side2="+"side3="+side3;
    }
    private static boolean
    isvalid(double a,double b,double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }
    }


