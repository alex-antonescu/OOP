import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumereDeComparat {

    private ArrayList<Double> numbers;
    private CitireFisier citireFisier;

    public NumereDeComparat(CitireFisier citireFisier) {

        this.numbers = new ArrayList<>();
        this.citireFisier = citireFisier;
    }

    public ArrayList<Double> extractNumbersFromFile() {
        String fileName = "";
        while (citireFisier.getListaFisiere() != null) {
            fileName = citireFisier.getListaFisiere().getFirst();
            citireFisier.getListaFisiere().removeFirst();
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                String line;

                while ((line = br.readLine()) != null) {
                    String[] parts = line.trim().split("\\s+");
                    for (String part : parts) {
                        try {
                            Double number = Double.parseDouble(part); // Convert to Double
                            numbers.add(number); // Store the number in the list
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid number format in file: " + fileName + " on line: " + line);
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + fileName + " - " + e.getMessage());
            } finally {
                try {
                    if (br != null) br.close(); // Ensure BufferedReader is closed
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(numbers.toString());
        return numbers;
    }
}


