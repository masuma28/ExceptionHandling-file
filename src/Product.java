public class Product {
    public void productcheck(int weight)throws MyException{
        if(weight<100) {
            throw new MyException("product is invalid");
        }
        else{
            System.out.println("product weight"+weight);
        }
    }
}
