/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tanggal20052025;

/**
 *
 * @author MyBook Hype AMD
 */
public class smartphone extends elektronik {
  private int kapasitasBaterai; 
     private int jumlahKamera;

   
    public smartphone() {
        super(); 
        this.kapasitasBaterai = 0;
        this.jumlahKamera = 0;
    }

   
    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getJumlahKamera() {
        return jumlahKamera;
    }

    public void setJumlahKamera(int jumlahKamera) {
        this.jumlahKamera = jumlahKamera;
    }
}
