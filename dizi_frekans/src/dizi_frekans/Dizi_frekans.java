/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dizi_frekans;

/**
 *
 * @author cihan
 */
public class Dizi_frekans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pointer = 0;
        
        int dizi[] = {5,2,2,2,2,2,4,5,6,7,8};
        int [] dizi2=new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            
            for (int j =0;j<dizi.length;j++) {
                if (dizi[i] == dizi[j]) {
                    pointer++;
                        
                }
                
            }
            
            
            System.out.println(dizi[i] + " sayisi  " + pointer + " kere tekrar etti");
            pointer = 0;
            
           

        }
       
    }

}
