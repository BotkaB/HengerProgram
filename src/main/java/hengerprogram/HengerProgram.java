/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hengerprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public class HengerProgram {

    private List<Henger> hengerek;
    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public HengerProgram() {
        hengerek=new ArrayList<>();
        hengerek.add(new Henger(5, 3));
        hengerek.add(new TomorHenger(4, 8));
        hengerek.add(new TomorHenger(7, 3, 6.2));
        hengerek.add(new Cso(3.5, 6, 2.1, 1.1));
    }

    private double atlagterfogat() {
        double total=0;
        for(Henger henger: lista()){
            total+=henger.terfogat();}
        return total/lista().size();
    }

    private double csovekSulya() {
        double suly=0;
        for(Henger cso: lista()){
            if(cso instanceof Cso) suly+=((Cso) cso).suly();
        }
        return suly;
    }

    private List<Henger> lista() {
        return Collections.unmodifiableList(hengerek);
    }

    private void run() {
        atlagterfogat();
        csovekSulya();
        lista();
    }
}
