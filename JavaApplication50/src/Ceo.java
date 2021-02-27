/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24661
 */
public class Ceo extends Universidad{
    private String nombre;
    private int registro;
    private String apellido, nacionalidad, titulo;
    private int edad, añosexp, añoslabor;

    public Ceo() {
    }

    public Ceo(String nombre, int registro, String apellido, String nacionalidad, String titulo, int edad, int añosexp, int añoslabor) {
        this.nombre = nombre;
        this.registro = registro;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.edad = edad;
        this.añosexp = añosexp;
        this.añoslabor = añoslabor;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosexp() {
        return añosexp;
    }

    public void setAñosexp(int añosexp) {
        this.añosexp = añosexp;
    }

    public int getAñoslabor() {
        return añoslabor;
    }

    public void setAñoslabor(int añoslabor) {
        this.añoslabor = añoslabor;
    }

    @Override
    public String toString() {
        return "Ceo{" + "nombre=" + nombre + ", registro=" + registro + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", titulo=" + titulo + ", edad=" + edad + ", a\u00f1osexp=" + añosexp + ", a\u00f1oslabor=" + añoslabor + '}';
    }
    
    
}
