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

public class LatihanD {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java LatihanD <gambar> <salinan>");
            return;
        }

        try (FileInputStream fis = new FileInputStream(args[0]);
             FileOutputStream fos = new FileOutputStream(args[1])) {

            byte[] buf = new byte[8192];
            int n;
            while ((n = fis.read(buf)) != -1) {
                fos.write(buf, 0, n);
            }
            System.out.println("Copy selesai dari gambar.png ke salinan.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







