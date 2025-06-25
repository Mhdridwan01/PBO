/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingkarang_kuis_22_04_2025;

 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pilih;
        double r, t;

        
        System.out.println("1. Lingkaran (Bangun Datar)");
        System.out.println("2. Kerucut (Bangun Ruang)");
        System.out.println("3. Slinder (Bangun Ruang)");
        System.out.print("Silahkan pilih: ");
        pilih = scanner.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = scanner.nextDouble();
           
                Lingkaran lingkaran = new Lingkaran(r);
                System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
                break;

            case 2:
                System.out.print("Masukkan jari_jari kerucut: ");
                r = scanner.nextDouble();
                System.out.print("Masukkan tinggi kerucut: ");
                t = scanner.nextDouble();
                Kerucut kerucut = new Kerucut(r, t);
                System.out.println("Volume Kerucut: " + kerucut.getvolume());
                System.out.println("Luas Permukaan Kerucut: " + kerucut.getLuas());
                break;

            case 3:
                System.out.print("Masukkan jari_jari slinder: ");
                r = scanner.nextDouble();
                System.out.print("Masukkan tinggi slinder: ");
                t = scanner.nextDouble();
                Slinder slinder = new Slinder(r, t);
                System.out.println("Volume Slinder: " + slinder.getVolume());
                System.out.println("Luas Permukaan Slinder: " + slinder.getLuas());
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}