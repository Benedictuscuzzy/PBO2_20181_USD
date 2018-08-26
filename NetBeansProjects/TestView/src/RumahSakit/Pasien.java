/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RumahSakit;

import java.text.SimpleDateFormat;
import java.util.Date;


//@author Ben
public class Pasien {

    private String nama;
    private Date date;
    private String NoRekamMedis;

    //tambah nomor rekam medis = String + setget
    public Pasien() {

    }

    public Pasien(String nama) {
        this.nama = nama;

    }

    public int getUsia() {
        Date today = new Date();
        return today.getYear() - date.getYear();

    }

    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        date = new Date(tahun - 1900, bulan - 1, tanggal);
    }

    public void setTanggalLahir(Date date) {
        this.date = date;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getDate() {
        return date;
    }

    public void NomorRekamMedis() {
           Date tgl = new Date();
           //System.out.println(tgl);
           NoRekamMedis = "yyyyMMdd";
           SimpleDateFormat ft = new SimpleDateFormat(NoRekamMedis);
           String str = getNama();
           System.out.println(ft.format(tgl)+str.substring(0, 3));
           
        //SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd");
        //rung rampung
    }


}
