/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asal_bulma;

/**
 *
 * @author cihan
 */
public class Asal_bulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4 ile 100 arasında asal sayıları bulan program;

        int sayac = 0;
        
        for(int sayi=4;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
               if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                } 
            }
                
            if(kontrol==0)
            {
                System.out.print(sayi+"\n");
                sayac++; 
            }
        }
    }
}


        
        
    
