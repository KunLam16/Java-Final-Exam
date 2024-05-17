import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class CopyFile {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("new_data.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;

        System.out.printf("Việc sao chép thành công với thơi gian %.2f giây.%n", durationInSeconds);
    }
}
