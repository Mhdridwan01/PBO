/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingkarang_kuis_22_04_2025;

/**
 *
 * @author MyBook Hype AMD
 */
public class Slinder extends Lingkaran {
    private double tinggi;
    
    public Slinder()
    {
        super();
        this.tinggi = 0;
    }
    public Slinder(double r,double t)
    {
        super(r);
        this.tinggi = t;

    }
    public void setTinggi()
    {
         this.tinggi = tinggi;

    }
    public double getTinggi()
    {
        
        return tinggi;

        
    }
    public double getVolume()
    {
        
       return super.getLuas() * tinggi;
 
    }
     @Override
    public double getLuas() {
        double luasAlas = super.getLuas();
        double keliling = super.getKeliling();
        return 2 * luasAlas + keliling * tinggi;
    }

    public String tostring(){
        return"Slinder dgn jari_jari = "+ getR()+",tinggi = " + tinggi + ",volume = " + getVolume()+ "luas permukaan = " + getLuas();
    
    }
    
}
