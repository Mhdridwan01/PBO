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
public class Square extends Rectangle {
    // Constructor
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    // Getter
    public double getSide() {
        return getWidth(); // karena width dan length sama
    }
    @Override
    public String toString() {
        return "Square side = " + getSide() + ", color = " + color + ", filled = " + filled;
    }
    
    
}
