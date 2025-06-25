/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum4032025;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MyBook Hype AMD
 */
public class array1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        int A[],n,i;
        int banyak = 0;
        int jumlah = 0;
        
        Scanner in=new Scanner(System.in);
        Random rand = new Random();
        System.out.print("MAsukkan banyak data :");
        n = in.nextInt();
        A = new int[n]; //A ukuran n
        System.out.println("---Data Anda---");
        for(i=0;i<n;i++)
        {
            A[i]= rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.println("");
        System.out.println("---Genap---");
        for (i=0;i<n;i++)
        {
            if (A[i] % 2 == 0){
                System.out.print(A[i]+"\t");
                banyak++;//banyak = banyak++
                jumlah = jumlah + A[1];
                 
            }
            
        }
        System.out.println("\nBanyak Genap: "+banyak);
        System.out.println("Jumlah : "+jumlah);
        
        
        
        
    }
    
}
