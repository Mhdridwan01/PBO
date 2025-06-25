/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tanggal20052025;

/**
 *
 * @author MyBook Hype AMD
 */
public class laptop extends elektronik{
   
    private int ukuranLayar;
    private int kapasitasRAM;

   
    public laptop() {
        super(); 
        this.ukuranLayar = 0;
        this.kapasitasRAM = 0;
    }

    
    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public int setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
        return this.ukuranLayar; 
    }

   
    public int getKapasitasRAM() {
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }
}

   
    

    
    
    
    

