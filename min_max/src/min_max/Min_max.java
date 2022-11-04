/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package min_max;

import java.util.Random;
import java.util.Scanner;

 
public class Min_max {
   int max(){
   
   Scanner scan= new Scanner(System.in);
       System.out.println("kaç tane sayi girmek istiyosunuz");
       int adet= scan.nextInt();
       int temp =0;
       int c=adet;
       System.out.println(" sayileri giriniz: ");
       
       while (adet!=1) {   
           int b= scan.nextInt();
           if(adet==c){
           temp=b;
           
           }
           else if(temp>b){
           temp=b;
           
           }
           adet--;
       }
   
   return temp;
   }  
      int min(){
   
   Scanner scan= new Scanner(System.in);
       System.out.println("kaç tane sayi girmek istiyosunuz");
       int adet= scan.nextInt();
       int temp =0;
       int c=adet;
       System.out.println(" sayileri giriniz: ");
       
       while (adet!=1) {   
           int b= scan.nextInt();
           if(adet==c){
           temp=b;
           
           }
           else if(temp<b){
           temp=b;
           
           }
           adet--;
       }
   
   return temp;
   }
    
    public static void main(String[] args) {
        Min_max a= new Min_max();
        
       
    }
    
}
