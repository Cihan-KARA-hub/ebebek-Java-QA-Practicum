/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patikastore1;

import patikastore1.brands.brands;
import patikastore1.electronic.computer;
import patikastore1.electronic.phone;

/**
 *
 * @author cihan
 */
public class PatikaStore1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here"
 
        brands brands = new brands();      
        brands.computer_Add(new computer(1, "asusa1", 3, 13, 12, "Asus", "13gb", "6 inch", "8 gb"));
        brands.computer_List("Asus");
        brands.phone_Add(new phone(13, "p40", 3, 1, 1, "Asus", "wşldm", "sşaknc", "qslşnc", "qwşldm", "wqfomwe"));      
        brands.phone_List("Asus");
          brands.phone_Add(new phone(13, "p50", 3, 1, 1, "Asus", "wşldm", "sşaknc", "qslşnc", "qwşldm", "wqfomwe"));      
        brands.phone_List("Asus");
       
          
    }
    
}
