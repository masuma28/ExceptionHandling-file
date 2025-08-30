import java.io.*;
import java.util.*;

    public class solve1{
        public static void main(String[] args) {
            File file = new File("Lab08_01.txt");
            Random rand = new Random();

            try (PrintWriter output = new PrintWriter(new FileWriter(file, true))) {
                for (int i = 0; i < 100; i++) {
                    output.print(rand.nextInt(1000) + " "); // random integer 0-999
                }
                output.println(); // new line after writing
                System.out.println("100 random integers written to Lab08_01.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

