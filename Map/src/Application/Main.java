
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Map<String, Integer> voters = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String lineCsv = br.readLine();
            while (lineCsv!= null){
                String[] fields = lineCsv.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (voters.containsKey(name)){
                    voters.put(name, voters.get(name) + votes);
                } else {
                    voters.put(name, votes);
                }

                lineCsv = br.readLine();
            }
            for (String key : voters.keySet()){
                System.out.printf("%s: %d%n", key, voters.get(key));
            }
        } catch (IOException e){
            throw new Exception("Error writing file: " + e.getMessage());
        }
    }
}
