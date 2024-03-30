package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    /*
        Programa DESAFIO: Análise de vendas 2 desenvolvido por Marcos Ferreira Shirafuchi
        Data: 29/03/2024
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre o caminho do arquivo: ");
        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<String, Double> sellers = new HashMap<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[2];
                double total = Double.parseDouble(fields[4]);
                if (sellers.containsKey(name)) {
                    double salesSoFar = sellers.get(name);
                    sellers.put(name, total + salesSoFar);
                } else {
                    sellers.put(name, total);
                }
                line = br.readLine();
            }
            System.out.println();
            System.out.println("Total de vendas por vendedor:");
            List<String> sellersList = sellers.entrySet().stream()
                    .map(names -> names.getKey() + " - R$ " + String.format("%.2f", names.getValue()))
                    .collect(Collectors.toList());
            for (String printed : sellersList) {
                System.out.println(printed);
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
