
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberFileReader {

    /**
     * Reads a .txt file containing numbers separated by commas.
     *
     * @param filePath path to the .txt file
     * @return int array with all numbers read from the file
     * @throws IOException if the file cannot be read
     */
    public int[] readNumbers(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder content = new StringBuilder();

            while ((line = br.readLine()) != null) {
                content.append(line.trim());
            }

            String[] tokens = content.toString().split(",");
            for (String token : tokens) {
                token = token.trim();
                if (!token.isEmpty()) {
                    try {
                        numbers.add(Integer.parseInt(token));
                    } catch (NumberFormatException e) {
                        System.err.println("Token inválido ignorado: '" + token + "'");
                    }
                }
            }
        }

        int[] result = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }
}