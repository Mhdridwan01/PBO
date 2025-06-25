/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum_tanggal27052025;

/**
 *
 * @author MyBook Hype AMD
 */
// Class Motor turunan dari Kendaraan (dengan getter dan setter)
class Motor extends kendaraan {
    private String jenisHelm;
    private int cc;

    public Motor(String merk, int tahun, String jenisHelm, int cc) {
        super(merk, tahun);
        this.jenisHelm = jenisHelm;
        this.cc = cc;
    }

    // Getter dan Setter
    public String getJenisHelm() {
        return jenisHelm;
    }

    public void setJenisHelm(String jenisHelm) {
        this.jenisHelm = jenisHelm;
    }

    public int getCC() {
        return cc;
    }

    public void setCC(int cc) {
        this.cc = cc;
    }

    // Implementasi method abstract
    @Override
    public void info() {
        System.out.println("Motor: " + merk + ", Tahun: " + tahun +
                ", Helm: " + jenisHelm + ", CC: " + cc);
    }

    @Override
    public void periksaKondisi() {
        System.out.println("Periksa kondisi motor: rantai, rem, lampu.");
    }

    @Override
    public void servis() {
        System.out.println("Servis motor dilakukan di bengkel resmi.");
    }
}