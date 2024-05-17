import java.util.function.IntUnaryOperator;
import java.util.Arrays;

public class SquareArrayUsingIntUnaryOperator {
    public static int[] squareArray(int[] numbers) {
        IntUnaryOperator squareOperator = x -> x * x;
        return Arrays.stream(numbers)
                .map(squareOperator)
                .toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 5, 3};
        int[] squaredNumbers = squareArray(numbers);

        System.out.print("Mảng mới chứa bình phương của các số từ mảng đã cho: ");
        for (int num : squaredNumbers) {
            System.out.print(num + " ");
        }
    }
}
