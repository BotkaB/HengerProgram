/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author OlajosViola(SZF_E_20
 */
public class Henger {
    private double sugar;
    private double magassag;
    public static int hengerDarab;

    public Henger(double sugar, double magassag) {
        this.sugar=sugar;
        this.magassag=magassag;
        hengerDarab++;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    
    public double terfogat(){
        return Math.pow(sugar, 2)*Math.PI*magassag;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
    
    
}
