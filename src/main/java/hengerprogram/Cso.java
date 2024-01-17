/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public class Cso extends TomorHenger{
    private double falvastagsag;

    public Cso(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }
    
    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag=falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    @Override
    public double terfogat(){
        return super.terfogat()-(Math.pow((super.getSugar()-falvastagsag),2)*Math.PI*super.getMagassag());
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }

}
