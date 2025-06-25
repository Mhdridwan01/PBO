/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum_tanggal27052025;

/**
 *
 * @author MyBook Hype AMD
 */
public class main_musik27052025 {
   public static void main(String[] args) {
        Gitar gitar = new Gitar("Gitar Klasik", "Petik", 6);
        Keyboard keyboard = new Keyboard("Yamaha PSR", "Elektronik", true);
        
        System.out.println("--info Gitar--");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println();
        
        System.out.println("--info Keyboard");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();

    }
} 

