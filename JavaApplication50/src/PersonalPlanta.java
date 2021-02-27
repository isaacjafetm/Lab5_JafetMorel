/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24661
 */
public class PersonalPlanta extends Universidad{
    private String nombre;
    private int registro;
    private String apellido, cargo, facultad, carrera, clase;

    public PersonalPlanta() {
    }

    public PersonalPlanta(String nombre, int registro, String apellido, String cargo, String facultad, String carrera, String clase) {
        this.nombre = nombre;
        this.registro = registro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.facultad = facultad;
        this.carrera = carrera;
        this.clase = clase;
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

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "PersonalPlanta{" + "nombre=" + nombre + ", registro=" + registro + ", apellido=" + apellido + ", cargo=" + cargo + ", facultad=" + facultad + ", carrera=" + carrera + ", clase=" + clase + '}';
    }
    
    
}
