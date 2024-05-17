import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Thread1 extends Thread {
    @Override
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try {
            while (true) {
                LocalDateTime now = LocalDateTime.now();
                System.out.println("Thread1: " + now.format(formatter));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread1 interrupted.");
        }
    }
}
