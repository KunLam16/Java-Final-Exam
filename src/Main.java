import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Milk milk1 = new Milk("Fresh Milk", 2.5f, "500ml", 10, LocalDate.of(2024, 5, 1));
//        Milk milk2 = new Milk("Bavi Milk", 2.0f, "450ml", 20, LocalDate.of(2023, 12, 31));
//
//
//        milk1.showInfo();
//        milk1.checkExpired();
//
//        milk2.showInfo();
//        milk2.checkExpired();


        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();
   }
}
