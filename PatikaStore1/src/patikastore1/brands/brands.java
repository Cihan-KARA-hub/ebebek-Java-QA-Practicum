/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikastore1.brands;

import java.util.ArrayList;
import java.util.Scanner;
import patikastore1.electronic.computer;
import patikastore1.electronic.phone;

public class brands {
//Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster

    ArrayList<String> brand = new ArrayList<>();
    phone phone = new phone();
    computer computer = new computer();

    public brands() {
        brand.add("Samsung");
        brand.add("Lenovo");
        brand.add("Huawei");
        brand.add("Casper");
        brand.add("Asus");
        brand.add("HP");
        brand.add("Xiaomi");
        brand.add("Monster");

    }

       public void computer_Add(computer computer) {
        // markalara elektronik cihaz ekleme methodu.
        // bu methodları farklı yazmalıyım.
        computer.add(computer);
       

    }
        public void phone_Add(phone phone){
     phone.add(phone);
    }

    public void phone_List(String item) {
        phone.list(item);

    }
    public  void computer_List(String item){
         computer.list(item);
    
    }

    public void brandList() {

        Scanner scan = new Scanner(System.in);

        String item = null;

        System.out.println(" listelemek istediginiz markayi seciniz ");
        System.out.println("""
                           0 . Samsung 
                           1 . Lenovo 
                           2 . Apple 
                           3 . Huawei 
                           4 . Casper
                           5 . Asus
                           6 . HP
                           7 . Xiaomi
                           8 . Monster
                           """);
        int temp = scan.nextInt();
        switch (temp) {

            case 0 ->
                item = "Samsung";
            case 1 ->
                item = "Lenovo";
            case 2 ->
                item = "Apple";
            case 3 ->
                item = "Huawei";
            case 4 ->
                item = "Casper";
            case 5 ->
                item = "Asus";
            case 6 ->
                item = "HP";
            case 7 ->
                item = "Xiaomi";
            case 8 ->
                item = "Monster";
            default ->
                System.out.println(" istedginiz marka bulunamadi .");
        }

        //alfabetik olacak
        for (int i = 0; i < brand.size(); i++) {
             
            if (brand.get(i).equals(phone.info(item))) {
                phone.list( item);
              
            }

        }
    }

   

}
