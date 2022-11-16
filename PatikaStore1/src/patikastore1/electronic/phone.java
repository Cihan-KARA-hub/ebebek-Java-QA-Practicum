/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patikastore1.electronic;

import java.util.*;

/**
 *
 * @author cihan
 */
public class phone {

    
    ArrayList<phone> ph =new ArrayList<>();

    int id;
    String name;
    int stock;
    int price;
    int discount;
    String brandInfo;
    String memory;
    String inch;
    String power;
    String ram;
    String color;

    public phone(int id, String name, int stock, int price, int discount, String brandInfo, String memory, String inch, String power, String ram, String color) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.discount = discount;
        this.brandInfo = brandInfo;
        this.memory = memory;
        this.inch = inch;
        this.power = power;
        this.ram = ram;
        this.color = color;
    }

    public phone() {
        
    }
    
    
    public void add(phone item) {
        //index ayarlaması yapılacak..
        ph.add(item);
          System.out.println(item.name+" adli urunu eklediniz eklediniz."+"\n"+"id numarasi :"+item.id);
          System.out.println("-----------------------");
     

    }

    public void remove() {
        Scanner item = new Scanner(System.in);
        System.out.printf(" silmek istediiniz id numarasını gidiniz :");
        int temp;
        temp = item.nextInt();
        for (int i = 0; i < ph.size(); i++) {

            if (ph.get(i).id == temp) {
                ph.remove(i);

                System.out.println(ph.get(i).id + " girdiiniz id numaralı ürün silinmiştir.");
            }

        }

    }

    public void list(String item) {
        
       

        for (int i = 0; i < ph.size(); i++) {
             
            if (ph.get(i).brandInfo.equals(item)) {
                System.out.println(
                        " Birim fiyati" + ph.get(i).price + "TL\n "
                        + "Indirim orani" + ph.get(i).discount+ "%\n "
                        + "Stok miktari" + ph.get(i).stock+ "Adet kaldi\n "
                        + "Urun adi" + ph.get(i).name+ "\n "
                        + "Marka bilgisi" + ph.get(i).brandInfo+ "\n "
                        + "Ram " + ph.get(i).ram+ "\n "
                        + "Depolama " + ph.get(i).memory+ "\n "
                        + "Ekran Boyutu " + ph.get(i).inch+ "\n "
                        + "Telefon rengi " + ph.get(i).color);
            
                
            
            }
        
        }
       

    }
     public String info(String item){
          for (int i = 0; i < ph.size(); i++) {
            if (ph.get(i).brandInfo==item) {
      return ph.get(i).brandInfo;
     }
          }
          return  null;
     }
    

   
   

    

}
