/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RumahSakit;

import java.text.SimpleDateFormat;
import java.util.Date;
//@author Ben
public class TestPasien {

    public static void main(String[] args) {
//        Date date = new Date(110,7,24);
//        Date today = new Date();
//        SimpleDateFormat ft =
//                new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(ft.format(date));
//        int age = today.getYear() - date.getYear();
//        System.out.println("Umur =" +age);
//        
        Pasien Dam = new Pasien("Puspaningsyas");
        Dam.setTanggalLahir(1974, 1, 12);
//        String str = Dam.getNama();
        
        

        System.out.println("Umur = " + Dam.getUsia());
        Dam.NomorRekamMedis();
      //  System.out.println(str.substring(0, 3));

//        Pasien Dam2 = new Pasien("Dam");
//        Dam2.setTanggalLahir(1999,3,13);
//        System.out.println("Umur = " +Dam2.getUsia());
    }
}
