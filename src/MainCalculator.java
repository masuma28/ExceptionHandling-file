import java.util.Scanner;
public class MainCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter n1: ");
            int a = inp.nextInt();
            System.out.println("Enter n2: ");
            int b = inp.nextInt();
            Calculator c1 = new Calculator(a, b);
            Calculator c2 = new Calculator(a, b);
            Calculator c3 = new Calculator(a, b);
            Calculator c4 = new Calculator(a, b);


            System.out.println("Addition= " + c1.Add());
            System.out.println("Substract= " + c2.Substract());
            System.out.println("Multiplication= " + c3.Multiplication());
            System.out.println("Addition= " + c4.Division());

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}