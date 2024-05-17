import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        try (FileWriter writer = new FileWriter("data.txt")) {
            for (int i = 0; i < 1000000; i++) {
                int randomNumber = random.nextInt();
                writer.write(randomNumber + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File 'data.txt' đã được tạo với 1 triệu số ngẫu nhiên.");
    }
}
