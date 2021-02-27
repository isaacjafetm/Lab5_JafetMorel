/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24661
 */
public class Tutores extends Estudiantes{
    private String clase;
    private boolean lab;

    public Tutores() {
    }

    public Tutores(String clase, boolean lab) {
        this.clase = clase;
        this.lab = lab;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean isLab() {
        return lab;
    }

    public void setLab(boolean lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "Tutores{" + "clase=" + clase + ", lab=" + lab + '}';
    }

    
    
}
