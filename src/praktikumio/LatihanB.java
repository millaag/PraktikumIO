/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumio;

/**
 *
 * @author L0324020 - Milla Agustin
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LatihanB {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Masukkan satu kalimat: ");
            String kalimat = br.readLine();
            String[] kata = kalimat.trim().split("\\s+");
            System.out.println("Jumlah kata: " + kata.length);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan input: " + e.getMessage());
        }
    }
}
 

