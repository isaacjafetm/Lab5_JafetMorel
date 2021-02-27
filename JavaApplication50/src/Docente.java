/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24661
 */
public class Docente extends Universidad{
    private String nombre;
    private int registro;
    private String apellido, clase, facultad;
    private boolean distintasfac;
    private String aconocimiento;
    private boolean lab;

    public Docente() {
    }

    public Docente(String nombre, int registro, String apellido, String clase, String facultad, boolean distintasfac, String aconocimiento, boolean lab) {
        this.nombre = nombre;
        this.registro = registro;
        this.apellido = apellido;
        this.clase = clase;
        this.facultad = facultad;
        this.distintasfac = distintasfac;
        this.aconocimiento = aconocimiento;
        this.lab = lab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public boolean isDistintasfac() {
        return distintasfac;
    }

    public void setDistintasfac(boolean distintasfac) {
        this.distintasfac = distintasfac;
    }

    public String getAconocimiento() {
        return aconocimiento;
    }

    public void setAconocimiento(String aconocimiento) {
        this.aconocimiento = aconocimiento;
    }

    public boolean isLab() {
        return lab;
    }

    public void setLab(boolean lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "Docente{" + "nombre=" + nombre + ", registro=" + registro + ", apellido=" + apellido + ", clase=" + clase + ", facultad=" + facultad + ", distintasfac=" + distintasfac + ", aconocimiento=" + aconocimiento + ", lab=" + lab + '}';
    }
    
}
