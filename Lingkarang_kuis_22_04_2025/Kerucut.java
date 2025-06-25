/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingkarang_kuis_22_04_2025;

/**
 *
 * @author MyBook Hype AMD
 */
public class Kerucut extends Lingkaran {
    private double tinggi;
    
    public Kerucut()
    {
       super();
       this.tinggi=0;
    }
    public Kerucut(double r,double t )
    {
      super(r);
      this.tinggi=t;
        
    }
    public void seTinggi(double tinggi)
    {
        this.tinggi=tinggi;
        
    }
    public double getTinggi()
    {
        
        return tinggi;
        
    }
    public double getvolume()
    {
        
        return (1.0/3)*super.getLuas()*tinggi;
        
    }
    @Override
    public double getLuas(){
        double s = Math.sqrt(Math.pow(getR(), 2) + Math.pow(tinggi, 2)); 
        return Math.PI * getR() * (getR() + s);
    }
    
    @Override
    public String toString(){
        return "Jari-jari = " + getR() +
               "\nTinggi = " + tinggi +
               "\nVolume = " + getvolume() +
               "\nLuas = " + getLuas();
}
}