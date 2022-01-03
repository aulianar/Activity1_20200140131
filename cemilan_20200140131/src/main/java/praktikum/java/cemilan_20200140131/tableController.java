/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.java.cemilan_20200140131;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Auliana Rizky
 */

@Controller
public class tableController {
    
    
    
    @RequestMapping("/input")
    //@ResponseBody
    public String inputanuser(HttpServletRequest data, Model sayur){
        
        datacemilan datac = new datacemilan();
        
        String nmSayur = data.getParameter("nmSayur");
        String hrgSayur = data.getParameter("hrgSayur");
        String jmlSayur = data.getParameter("jmlSayur");
        String uangBayar = data.getParameter("byrSayur");
        
        
        Double hargaSayur = datac.getHarga(hrgSayur);
        Double jumlahSayur = datac.getJumlah(jmlSayur);
        Double jumlahBayar = datac.getjumlahBayar(hargaSayur, jumlahSayur);
        String disc = datac.getdisc(jumlahBayar);
        Double hargaDiskon = datac.gethargaDisc(jumlahBayar, Integer.valueOf(disc));
        Double totalBayar =  datac.gettotalBayar(jumlahBayar, hargaDiskon);
        Double pembayaran = datac.getPembayaran (uangBayar);
        Double kembalian = datac.getKembalian (totalBayar, pembayaran);
        datac.gettdiskon(totalBayar, jumlahBayar, hargaSayur, Integer.valueOf(disc));
        
        
        
        sayur.addAttribute("name",nmSayur);
        sayur.addAttribute("price",hrgSayur);
        sayur.addAttribute("kilo",jmlSayur);
        sayur.addAttribute("tbayar",totalBayar);
        sayur.addAttribute("hargadisc",hargaDiskon);
        sayur.addAttribute("disc",disc);
        sayur.addAttribute("total10",jumlahBayar);
        sayur.addAttribute("jumlah",pembayaran);
        sayur.addAttribute("kembali",kembalian);
        return "viewerTable";
    }
}
