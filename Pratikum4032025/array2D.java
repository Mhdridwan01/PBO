/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum4032025;

/**
 *
 * @author MyBook Hype AMD
 */
import java.util.Scanner;
import java.util.Random;
public class array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int Y[][];
        int i,j,b,k;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Masukkan jumlah baris = ");
        b=in.nextInt();
        System.out.print("Masukkan jumlah kolom = ");
        k=in.nextInt();
        Y =new int [b][k];
        for(i=0;i<b;i++){
            for (j=0;j<k;j++){
                Y[i][j]=random.nextInt(100)+1;
                System.out.print(Y[i][j]+"\t");
                 }
            System.out.println();
        }
        
    }
    
}
