import java.io.*;

    public class File3 {
        public static void main(String[] args) {
            File inputFile = new File("input.txt");   // You should create input.txt manually
            File outputFile = new File("File3.dat");

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 DataOutputStream writer = new DataOutputStream(new FileOutputStream(outputFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.writeUTF(line); // UTF-8 string
                }
                System.out.println("Lines written into Lab08_03.dat as UTF-8.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

