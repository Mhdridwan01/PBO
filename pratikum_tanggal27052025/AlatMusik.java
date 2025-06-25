/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum_tanggal27052025;

/**
 *
 * @author MyBook Hype AMD
 */
  public abstract class AlatMusik {
    protected String nama;
    protected String jenis;

    // Constructor
    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    // Method biasa (non-abstract)
    public void info() {
        System.out.println("Nama: " + nama + ",jenis: " + jenis );
    }

    // Method abstract yang harus diimplementasi subclass
    public abstract void mainkan();
    public abstract void stem();
}


