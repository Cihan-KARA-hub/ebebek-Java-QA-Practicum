/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package artık_yıl;

import java.util.Scanner;

/**
 *
 * @author cihan
 */
public class Artık_yıl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();
        System.out.print("-----------------------\n");

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println(year + "\nBir artık yıldır.");
                }
                else
                {
                    System.out.println(year + "\nBir artık yıl değildir.");
                }
            }
            else
            {
                System.out.println(year+ "\nBir artık yıldır.");
            }
        }
        else
        {
            System.out.println(year + "\nBir artık yıl değildir.");
        }
    }
    
}
