/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.ti.konversi.berat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Auliana Rizky Puspita Dewi
 */
@Controller
public class projectController {

    /**
     *
     */
    @RequestMapping("/konversi")
    @ResponseBody
    public String getMassa(){
        String konversi = " ";
        double kilogram = 200;
        double hektagram = 200;
        double gram = 200;
        double massa;
        
        String choose = "g";
        
        if (choose==" kg" ){
            massa = gram / 1000;
            konversi = "kilogram : " + massa;
        }
        else if (choose=="g" ){
            massa = kilogram * 1000;
            konversi = "gram : " + massa;
        }
        else{
            konversi = "Not Found";
        }
        return konversi;
    }   
}
