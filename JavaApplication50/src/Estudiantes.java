/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24661
 */
public class Estudiantes extends Universidad{
    private String nombre;
    private int registro;
    private String apellido, carrera;
    private boolean deporte;
    private String facultad;
    private int clasesxcursar;
    private boolean beca, automovil;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, int registro, String apellido, String carrera, boolean deporte, String facultad, int clasesxcursar, boolean beca, boolean automovil) {
        this.nombre = nombre;
        this.registro = registro;
        this.apellido = apellido;
        this.carrera = carrera;
        this.deporte = deporte;
        this.facultad = facultad;
        this.clasesxcursar = clasesxcursar;
        this.beca = beca;
        this.automovil = automovil;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public boolean isDeporte() {
        return deporte;
    }

    public void setDeporte(boolean deporte) {
        this.deporte = deporte;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getClasesxcursar() {
        return clasesxcursar;
    }

    public void setClasesxcursar(int clasesxcursar) {
        this.clasesxcursar = clasesxcursar;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public boolean isAutomovil() {
        return automovil;
    }

    public void setAutomovil(boolean automovil) {
        this.automovil = automovil;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", registro=" + registro + ", apellido=" + apellido + ", carrera=" + carrera + ", deporte=" + deporte + ", facultad=" + facultad + ", clasesxcursar=" + clasesxcursar + ", beca=" + beca + ", automovil=" + automovil + '}';
    }
    
}
