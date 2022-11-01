/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uçak_bileti_hesaplama;

import java.util.Scanner;

public class Uçak_Bileti_Hesaplama {


    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner scan = new Scanner(System.in);
    double price=100;

  

    
                System.out.println(" kac km yolculuk yapacaksiniz:  ");
        int km = scan.nextInt();
        price=km*price;
                System.out.println("gidis donus :True ,tek sefer :False");
        boolean type = scan.nextBoolean();
        if (type == true) {
            price*=2;
            price*=0.3;

        } else {
            

        }
                System.out.println(" yasinizi giriniz :");
        int age=scan.nextInt();
        if(age<12){
        
        price*=0.33;
        }
        if(age>65){
        price*=0.55;
        }
        else{
        
        
        }
        if(age<0||km<0){
            System.out.println(" hatalı giriş yaptınız ");
        System.exit(0);
        }
        System.out.println(" bilet fiyatiniz "+ price);
    
        
    }

}
