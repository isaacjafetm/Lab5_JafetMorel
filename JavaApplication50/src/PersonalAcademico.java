/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24661
 */
public class PersonalAcademico extends Universidad{
    private String nombre;
    private int registro;
    private String apellido, cargo, puesto;
    private int becados, personas;
    private String lugar, cargo2, acuerdo;

    public PersonalAcademico() {
    }

    public PersonalAcademico(String nombre, int registro, String apellido, String cargo, String puesto, int becados, int personas, String lugar, String cargo2, String acuerdo) {
        this.nombre = nombre;
        this.registro = registro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.puesto = puesto;
        this.becados = becados;
        this.personas = personas;
        this.lugar = lugar;
        this.cargo2 = cargo2;
        this.acuerdo = acuerdo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getBecados() {
        return becados;
    }

    public void setBecados(int becados) {
        this.becados = becados;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCargo2() {
        return cargo2;
    }

    public void setCargo2(String cargo2) {
        this.cargo2 = cargo2;
    }

    public String getAcuerdo() {
        return acuerdo;
    }

    public void setAcuerdo(String acuerdo) {
        this.acuerdo = acuerdo;
    }

    @Override
    public String toString() {
        return "PersonalAcademico{" + "nombre=" + nombre + ", registro=" + registro + ", apellido=" + apellido + ", cargo=" + cargo + ", puesto=" + puesto + ", becados=" + becados + ", personas=" + personas + ", lugar=" + lugar + ", cargo2=" + cargo2 + ", acuerdo=" + acuerdo + '}';
    }
    
    
}
