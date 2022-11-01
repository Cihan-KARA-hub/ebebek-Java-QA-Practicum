/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ebebek_vücutkitleindexi;

import java.util.*;

class hesapla {

    Scanner scan = new Scanner(System.in);

    void hesapla() {
        System.out.println(" lutfen boyunuzu giriniz: ");
        double boy = scan.nextDouble();

        System.out.println(" lutfen kilonuzu giriniz :");
        double kilo = scan.nextDouble();
        if (boy < 0 || kilo < 0) {

            System.out.println(" geçerli bir boy giriniz ");
            System.exit(0);

        }
        double temp = kilo / (boy * boy);

        System.out.println("  kitle indeksiniz " + temp);

        if (temp < 20) {
            System.out.println("aşiri zayifsiniz lutfen bir diyetisyene başvurunuz ");
        }
        if (20 <= temp && temp < 27) {
            System.out.println(" uygun kilodasiniz ");

        }
          if (27 <= temp && temp < 35) {
            System.out.println(" fazla  kilodasiniz ");

        }
            if (temp >=30) {
            System.out.println("asiri kilolusunuz  lutfen bir diyetisyene başvurunuz ");
        }
    }
}
    public class Ebebek_vücutKitleİndexi {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            hesapla a = new hesapla();
            a.hesapla();

        }

    }
