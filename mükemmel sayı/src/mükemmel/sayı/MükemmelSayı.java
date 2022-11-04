/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mükemmel.sayı;

import java.util.Scanner;

/**
 *
 * Örneğin 6 sayısını ele alalım: 1, 2, 3 ve 6 bu
 * sayının bölenleridir ve tüm bu bölenlerin toplamı, 
 * yani 1+2+3+6, sayının iki katı olan 12’ye eşittir. 
 * Bu yüzden 6 ilk mükemmel sayıdır.
 */
public class MükemmelSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" sayınızı giriniz ..");
          Scanner scan = new Scanner(System.in);
        int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
    }
    
}
