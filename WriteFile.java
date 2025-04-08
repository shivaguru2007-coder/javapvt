import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    static void readMatrix(int[][] matrix, FileReader fileReader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (int i = 0; i < 3; i++) {
            String line = bufferedReader.readLine();
            String[] values = line.split(" ");
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(values[j]);
            }
        }
        bufferedReader.close();
    }

    public static void main(String[] args) {
        try {
            FileReader Reader1 = new FileReader("matrix1.txt");
            FileReader Reader2 = new FileReader("matrix2.txt");
            FileWriter Writer = new FileWriter("myfile.txt");

            // Writing File
            Writer.write("Files in Java Easy to Create !");
            Writer.write("\n");
            Writer.write("Matrix Multiplication");
            Writer.write("\n");

            int[][] a = new int[3][3];
            int[][] b = new int[3][3];
            int[][] c = new int[3][3];

            // Read matrices from files
            readMatrix(a, Reader1);
            readMatrix(b, Reader2);

            // Matrix Multiplication
            System.out.println("Matrix Multiplication");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    Writer.write(c[i][j] + " ");
                }
                Writer.write("\n");
            }

            Reader1.close();
            Reader2.close();
            Writer.close();

            System.out.println("Successfully written.");
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}