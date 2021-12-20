/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.Activity1DataKTP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Auliana Rizky Puspita Dewi
 */
@Controller
public class tableController {
    @RequestMapping("/dataKTP")
    //@ResponseBody
    
    public String getData(Model ktp){
        //String result = "Riris cantik calon Jaeyun";
        //ktp.addAttribute("Data", result);
        
        //dataKTP data = new dataKTP();
        ArrayList<List<String>> dataKTP = new ArrayList<>();
        
        dataKTP.add(0,Arrays.asList("ID", "Nomor", "Nama", "Alamat"));
        dataKTP.add(1,Arrays.asList("1", "1111", "Sim Jaeyun", "Australia"));
        dataKTP.add(2,Arrays.asList("2", "1112", "Yang Jungwon", "Seoul"));
        dataKTP.add(3,Arrays.asList("3", "1113", "Lee Heeseung", "Namyangju"));
        dataKTP.add(4,Arrays.asList("4", "1114", "Park Jongseong", "Seattle Washington"));
        dataKTP.add(5,Arrays.asList("5", "1115", "Park Sunghoon", "Seoul"));
        dataKTP.add(6,Arrays.asList("6", "1116", "Kim Sunoo", "Suwon"));
        dataKTP.add(7,Arrays.asList("7", "1117", "Nishimura Riki", "Okayama Jepan"));
        dataKTP.add(8,Arrays.asList("8", "1118", "Choi Soobin", "Seoul"));
        dataKTP.add(9,Arrays.asList("9", "1119", "Choi Yeonjun", "Seoul"));
        dataKTP.add(10,Arrays.asList("10", "11110", "Choi Beomgyu", "Seoul"));
        dataKTP.add(11,Arrays.asList("11", "11111", "Kang Taehyun", "Seoul"));
        dataKTP.add(12,Arrays.asList("12", "11112", "Huening Kai", "Seoul"));
        dataKTP.add(13,Arrays.asList("13", "11113", "Kim Namjoon", "Seoul"));
        dataKTP.add(14,Arrays.asList("14", "11114", "Kim Seokjin", "Seoul"));
        dataKTP.add(15,Arrays.asList("15", "11115", "Min Yoongi", "Seoul"));
        dataKTP.add(16,Arrays.asList("16", "11116", "Jung Hoseok", "Seoul"));
        dataKTP.add(17,Arrays.asList("17", "11117", "Park Jimin", "Seoul"));
        dataKTP.add(18,Arrays.asList("18", "11118", "Kim Taehyung", "Seoul"));
        dataKTP.add(19,Arrays.asList("19", "11119", "Jeon Jungkook", "Seoul"));
        dataKTP.add(20,Arrays.asList("20", "11120", "Bang Si Hyuk", "Seoul"));
        
        ktp.addAttribute("view", dataKTP);
        
        return "tableViewer";
    }
}
