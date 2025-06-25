/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lingkarang_kuis_22_04_2025;

/**
 *
 * @author MyBook Hype AMD
 */
public class Lingkaran {
    private double r;
    
    public Lingkaran()
    {
        this.r=0;
    
    }
    public Lingkaran(double r)
    {
        this.r=r;
    }
    public void setR(double r)
    {
        this.r=r;
    }
    public double getR()
    {
        
        return r;
        
    }
    public double getDiameter()
    {
        
        return 2*r;
        
    }
    public double getKeliling()
    {
        
        return 2*Math.PI*r;
        
    }
    public double getLuas()
    {
        return 0;
    }
    @Override
    public String toString(){
        return "Lingkaran dgn jari_jari= "+r+
                "\nKeliling = " + getKeliling() +
               "\nLuas = " + getLuas();
    }

}


