import java.io.*;
import java.util.*;

public class IntervalProcessor {

        public static void main(String[] args) {
            List<Interval> intervals = new ArrayList<>();
            Set<String> realNumberFiles = new HashSet<>(); // Used to avoid duplicate files
            List<Double> realNumbers = new ArrayList<>();

            // Step 1: Read intervals from "intervale.dat"
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ALEX\\Desktop\\Laboratoare\\OOP4\\E5V2\\src\\intervale"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.trim().split("\\s+");
                    if (parts.length == 2) {
                        int lower = Integer.parseInt(parts[0]);
                        int upper = Integer.parseInt(parts[1]);
                        intervals.add(new Interval(lower, upper));
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading intervals file: " + e.getMessage());
                return;
            }

            // Step 2: Read file names from user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the names of the files containing real numbers (type 'done' to finish):");
            while (true) {
                String fileName = scanner.nextLine();
                if (fileName.equalsIgnoreCase("done")) {
                    break;
                }
                if (!realNumberFiles.add(fileName)) {
                    System.out.println("File '" + fileName + "' has already been added. Skipping...");
                }
            }

            // Step 3: Read real numbers from the files
            for (String fileName : realNumberFiles) {
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] parts = line.trim().split("\\s+");
                        for (String part : parts) {
                            try {
                                Double number = Double.parseDouble(part);
                                realNumbers.add(number);
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid number format in file '" + fileName + "': " + part);
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error reading real numbers file '" + fileName + "': " + e.getMessage());
                }
            }

            // Step 4: Test each number against all intervals
            for (Double number : realNumbers) {
                for (Interval interval : intervals) {
                    interval.testNumber(number);
                }
            }

            // Step 5: Write the results
            if (args.length > 0) {
                // Write to specified output file
                try (PrintWriter writer = new PrintWriter(new FileWriter(args[0]))) {
                    for (Interval interval : intervals) {
                        interval.writeResults(writer);
                    }
                } catch (IOException e) {
                    System.out.println("Error writing to output file: " + e.getMessage());
                }
            } else {
                // Write to console
                PrintWriter writer = new PrintWriter(System.out);
                for (Interval interval : intervals) {
                    interval.writeResults(writer);
                }
                writer.flush();
            }
        }
    }
