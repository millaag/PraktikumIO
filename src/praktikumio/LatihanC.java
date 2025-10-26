/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumio;

/**
 *
 * @author L0324020 - Milla Agustin
 */
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class LatihanC {
    public static void main(String[] args) {
        Path inputPath = Paths.get("input.txt");
        Path outputPath = Paths.get("count.txt");
        
        Map<String, Integer> frekuensi = new HashMap<>();
        
        try (BufferedReader br = Files.newBufferedReader(inputPath, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", ""); 
                String[] words = line.trim().split("\\s+");
                for (String w : words) {
                    if (!w.isEmpty()) {
                        frekuensi.put(w, frekuensi.getOrDefault(w, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Gagal membaca file: " + e.getMessage());
            return;
        }
        
        
        try (BufferedWriter bw = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)) {
            for (Map.Entry<String, Integer> entry : frekuensi.entrySet()) {
                bw.write(entry.getKey() + ": " + entry.getValue());
                bw.newLine();
            }
            System.out.println("Hasil frekuensi kata disimpan di count.txt");
        } catch (IOException e) {
            System.err.println("Gagal menulis file: " + e.getMessage());
        }
    }
}


