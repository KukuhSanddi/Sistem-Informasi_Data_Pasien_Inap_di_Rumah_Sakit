/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi_data_pasien_inap_di_rumah_sakit;

/**
 *
 * @author Kukuh Sanddi
 */
public class Pasien extends Orang{
    private int lvPasien;

    public int getLvPasien() {
        return lvPasien;
    }

    public void setLvPasien(int lvPasien) {
        this.lvPasien = lvPasien;
    }
    
    public String gelar {
        if (lvPasien == 1){
            return "Tuan "+o.getnama();
        }
        else if (lvPasien == 2){
            return "Nyonya "+o.getnama();
        }
        else if (lvPasien == 3){
            return "Nona "+o.getnama();
        }
        return "(tidak teridentifikasi)";
        
    }
}

}
