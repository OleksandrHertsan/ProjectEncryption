import java.util.List;

public class Main {
    public static void main(String[] args) {
        String original = "Привет, мир";
        String reversedOrder = "евирпим, тр";

        List<String> substrings = Encrypt.splitToSubstrings(reversedOrder);

        String resultText = Encrypt.buildEncryptedString(substrings);
        System.out.println(resultText);

    }
}
