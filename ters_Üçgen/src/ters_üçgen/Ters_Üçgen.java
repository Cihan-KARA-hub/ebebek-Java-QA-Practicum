/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ters_üçgen;

/**
 *
 * @author cihan
 */
public class Ters_Üçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
int i,j,k;//Değişekenlerimizi tanımladık.
        for (i=10; 0<i; i--) {//Döngümüzün ne kadar döneceğini belirtir.
           for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
               System.out.print(" ");//Boşluğumuzu belirtiyoruz.
           }
           for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
               System.out.print("c");//Sembolümüzü belirledik ve çıktısını sağladık.
               System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar. 
           }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }
    }
    
}
