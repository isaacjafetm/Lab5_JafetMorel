/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24661
 */
public class Administrativo extends Universidad{
    private String nombre;
    private int registro;
    private String apellido, cargo, area;
    private int subordinados;
    private String asistente, jefe;

    public Administrativo() {
    }

    public Administrativo(String nombre, int registro, String apellido, String cargo, String area, int subordinados, String asistente, String jefe) {
        this.nombre = nombre;
        this.registro = registro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.area = area;
        this.subordinados = subordinados;
        this.asistente = asistente;
        this.jefe = jefe;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) {
        this.subordinados = subordinados;
    }

    public String getAsistente() {
        return asistente;
    }

    public void setAsistente(String asistente) {
        this.asistente = asistente;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "nombre=" + nombre + ", registro=" + registro + ", apellido=" + apellido + ", cargo=" + cargo + ", area=" + area + ", subordinados=" + subordinados + ", asistente=" + asistente + ", jefe=" + jefe + '}';
    }
    
    
}
