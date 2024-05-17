import java.util.Random;

public class Thread2 extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Thread2: Số ngẫu nhiên: " + randomNumber);
    }
}

