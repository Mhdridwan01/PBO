/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih bentuk yang ingin dibuat:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Masukkan radius: ");
                double radius = scanner.nextDouble();
                System.out.print("Masukkan warna: ");
                String circleColor = scanner.next();
                System.out.print("Apakah sudah terisi? (true/false): ");
                boolean circleFilled = scanner.nextBoolean();
                
                Circle circle = new Circle(radius, circleColor, circleFilled);
                System.out.println(circle);
                System.out.println("Area: " + circle.getArea());
                System.out.println("Perimeter: " + circle.getPerimeter());
                break;
                
            case 2:
                System.out.print("Masukkan lebar: ");
                double width = scanner.nextDouble();
                System.out.print("Masukkan panjang: ");
                double length = scanner.nextDouble();
                System.out.print("Masukkan warna: ");
                String rectangleColor = scanner.next();
                System.out.print("Apakah sudah terisi? (true/false): ");
                boolean rectangleFilled = scanner.nextBoolean();
                
                Rectangle rectangle = new Rectangle(width, length, rectangleColor, rectangleFilled);
                System.out.println(rectangle);
                System.out.println("Area: " + rectangle.getArea());
                System.out.println("Perimeter: " + rectangle.getPerimeter());
                break;
                
            case 3:
                System.out.print("Masukkan sisi: ");
                double side = scanner.nextDouble();
                System.out.print("Masukkan warna: ");
                String squareColor = scanner.next();
                System.out.print("Apakah sudah terisi? (true/false): ");
                boolean squareFilled = scanner.nextBoolean();
                
                Square square = new Square(side, squareColor, squareFilled);
                System.out.println(square);
                System.out.println("Area: " + square.getArea());
                System.out.println("Perimeter: " + square.getPerimeter());
                break;
                
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        
        scanner.close();
    }
}

