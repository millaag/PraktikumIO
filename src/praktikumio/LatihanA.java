/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumio;

/**
 *
 * @author L0324020 - Milla Agustin
 */
import java.util.Scanner;

public class LatihanA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        System.out.println("Jumlah: " + (a + b));
        sc.close();
    }
}


