import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static Map<Character, Integer> countCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String input = "National Economics University";
        Map<Character, Integer> result = countCharacterFrequency(input);

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println("Ký tự '" + entry.getKey() + "' xuất hiện " + entry.getValue() + " lần.");
        }
    }
}
