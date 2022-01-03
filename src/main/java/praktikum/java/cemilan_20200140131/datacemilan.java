/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.java.cemilan_20200140131;

/**
 *
 * @author USER DJOGJA
 */
public class datacemilan {
    
    public Double getHarga(String hrgSayur){
       
        Double hargaSayur = Double.valueOf(hrgSayur);
        
        return hargaSayur;
    }
    
    public Double getJumlah(String jmlSayur){
    
        Double jumlahSayur = Double.valueOf(jmlSayur);
    
        return jumlahSayur;
    }
    
    public Double gettotalBayar(Double jumlahBayar, Double hargaDiskon){
    
        Double totalBayar = jumlahBayar - hargaDiskon;
        
        return totalBayar;
    }
    
    public Double getjumlahBayar(Double hrgSayur, Double jmlSayur){
    
        Double jumlahBayar = hrgSayur * jmlSayur;
    
        return jumlahBayar;
    }
    
    public String getdisc(Double jumlahBayar){
    
        String disc = null;
        
        if (jumlahBayar <16000) {
            disc = "0";
        }else if (jumlahBayar <25000){
            disc = "10";
        }else{
            disc = "15";
        }
        return disc;
    }
    
    public Double gethargaDisc(Double jumlahBayar, Integer disc){
        
        Double hargaDiskon = jumlahBayar * disc /100;
    
        return hargaDiskon;
    }
    
    public void gettdiskon(Double totalBayar, Double jumlahBayar, Double hargaDiskon, Integer diskon){
        
        if(jumlahBayar < 16000){
            diskon = 0;
            totalBayar = jumlahBayar - (jumlahBayar * diskon / 100);
            hargaDiskon = jumlahBayar * diskon / 100;
            
        }else if(jumlahBayar < 25000){
            diskon = 10;
            totalBayar = jumlahBayar - (jumlahBayar * diskon / 100);
            hargaDiskon = jumlahBayar * diskon / 100;
        }else {
            diskon = 15;
            totalBayar = jumlahBayar - (jumlahBayar * diskon / 100);
            hargaDiskon = jumlahBayar * diskon / 100;
        }
    }
    
    public Double getPembayaran(String uangBayar){
        Double pembayaran = Double.valueOf(uangBayar);
        
        return pembayaran;
    }
    
    public Double getKembalian(Double totalBayar, Double uangBayar){
        Double kembalian = uangBayar - totalBayar;
        
        return kembalian;
    }
}
