import java.util.Scanner;
public class ArrayIndex {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n[]=new int[100];
        for(int i=0;i<n.length;i++){
        }
        System.out.println("Enter Array number : ");
        try {
            int index = inp.nextInt();
            System.out.println(n[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds");
        }
    }
}
