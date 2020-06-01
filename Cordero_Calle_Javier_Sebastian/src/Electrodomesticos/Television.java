/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos;

/**
 *
 * @author Usuario
 */
public class Television {
    private int resolucion;
    private boolean HDMI;

    public int getResolucion() {
        return resolucion;
    }

    public boolean isHDMI() {
        return HDMI;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setHDMI(boolean HDMI) {
        this.HDMI = HDMI;
    }

    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", HDMI=" + HDMI + '}';
    }
    
    
}
