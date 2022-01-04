/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.ti.project.matauang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import praktikum.ti.project.matauang.logicalProses;

/**
 *
 * @author user
 */
@Controller
@ResponseBody
public class projectController {
    logicalProses logic=new logicalProses();
    
    @RequestMapping("/LekkeRp")
    public String tampilkanMataUangLekAlbania(){
        int KonversiLekkeRp = logic.getKonversiLekkeRp(5000);
        String view = "hasil Konversi Lek Albania ke Rupiah = " + KonversiLekkeRp;
       
        return view;
    }
    
    @RequestMapping("/RskeRp")
    public String tampilkanMataUangRupeeMauritius(){
        int KonversiRskeRp = logic.getKonversiRskeRp(5000);
        String view = "Hasil Konversi Rupee Mauritius ke Rupiah = "+KonversiRskeRp;
        
        return view;
    }
    
    @RequestMapping("/KzkeRp")
    public String tampilkanMataUangKwanzaAngola(){
        int KonversiKzkeRp = logic.getKonversiKzkeRp(5000);
        String view = "Hasil Konversi Kwanza Angola ke Rupiah = "+KonversiKzkeRp;
        
        return view;
    }
    
     @RequestMapping("/BrkeRp")
    public String tampilkanMataUangBirrEtiopia(){
        int KonversiBrkeRp = logic.getKonversiBrkeRp(5000);
        String view = "Hasil Konversi Birr Etiopia ke Rupiah = "+KonversiBrkeRp;
        
        return view;
    }
    
     @RequestMapping("/ShkeRp")
    public String tampilkanMataUangShillingKenya(){
        int KonversiShkeRp = logic.getKonversiShkeRp(5000);
        String view = "Hasil Konversi Shilling Kenya ke Rupiah = "+KonversiShkeRp;
        
        return view;
    }

}
