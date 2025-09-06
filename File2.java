
    import java.io.*;
import java.util.*;

    public class File2 {
        public static void main(String[] args) {
            File file = new File("Lab08_02.dat");
            Random rand = new Random();

            try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)))) {
                for (int i = 0; i < 100; i++) {
                    output.writeInt(rand.nextInt(1000));
                }
                System.out.println("100 random integers written to Lab08_01.dat (binary)");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




