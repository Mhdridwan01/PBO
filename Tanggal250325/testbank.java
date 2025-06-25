/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal250325;

/**
 *
 * @author MyBook Hype AMD
 */
public class testbank
{
     public static void main(String[] args) {
        
        Nasabah nasabah1 = new Nasabah("awak 1", "awak 2");
        Tabungan tabungan1 = new Tabungan(10000);
        nasabah1.setTabungan(tabungan1);

        
        Nasabah nasabah2 = new Nasabah("awak 2", "awak 1");
        Tabungan tabungan2 = new Tabungan(5000);
        nasabah2.setTabungan(tabungan2);

       
        System.out.println("Informasi nasabah dan saldo");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println(nasabah2);
        System.out.println();
        
        System.out.println("Riwayat menabung nasabah");
       
        tabungan1.simpanUang(4000);
        System.out.println("Setelah awak 1 menabung 4000: " + tabungan1.getSaldo());

       
        tabungan2.simpanUang(7000);
        System.out.println("Setelah awak 2 menabung 7000: " + tabungan2.getSaldo());

        System.out.println("\nRiwayat penarikan nasabah");
       
        tabungan1.ambilUang(5000);
        System.out.println("Setelah awak 1 mengambil 5000: " + tabungan1.getSaldo());

       
        tabungan2.ambilUang(6000);
        System.out.println("Setelah awak 2 mengambil 6000: " + tabungan2.getSaldo());

        
        tabungan2.transfer(tabungan1, 1000);
        System.out.println("\nSetelah awak 1 transfer 1000 ke awak :");
        System.out.println("Saldo awak 1: " + tabungan1.getSaldo());
        System.out.println("Saldo awak 2: " + tabungan2.getSaldo());
        
    }
}



//M.Ridwan
//TEKKOM 1B