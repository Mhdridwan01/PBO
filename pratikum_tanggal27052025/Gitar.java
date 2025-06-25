/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum_tanggal27052025;

/**
 *
 * @author MyBook Hype AMD
 */
 public class Gitar extends AlatMusik {
    private int jumlahSenar;

    // Constructor
    public Gitar(String nama, String jenis, int jumlahSenar) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + " dipetik " + jumlahSenar + " senar.");
    }

    // Override method abstract stem
    @Override
    public void stem() {
        System.out.println("Menyetem gitar" + nama + " distem untuk menyetel senar agar nada pas.");
    }
}


