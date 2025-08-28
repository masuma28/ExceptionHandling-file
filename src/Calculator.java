public class Calculator {
    int n1,n2;
    public Calculator(int a,int b){
        n1=a;
        n2=b;
    }
    public int Add(){
        if(n1<0||n2<0){
            throw new ArithmeticException("Number must be positive");
        } return n1+n2;
    }
    public int substract(){
        if(n1==0||n2==0){
            throw new ArithmeticException("Number cannot be zero");
        } return n1-n2;
    }public int Multiplication(){
        if (n1==0||n2==0) {
            throw new ArithmeticException("Number should not be zero");
        } return n1*n2;
    }
    public int Division() {
        if (n1 == 0 || n2 == 0) {
            throw new ArithmeticException("Number cant be zero");
        } return n1/n2;
    }


}
