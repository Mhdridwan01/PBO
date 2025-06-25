/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tanggal20052025;

/**
 *
 * @author MyBook Hype AMD
 */
public class smartwatch {
 private int ukuranLayar;
    private boolean tahanAir;

   
    public smartwatch() {
        super();
        this.ukuranLayar = 0;
        this.tahanAir = false;
    }

    
    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public boolean isTahanAir() {
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }
}