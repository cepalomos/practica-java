package com.softech.colegio.model;

import java.util.List;

public class Colegio {

    private int idColegio;
    private String nombre;
    private List<Cursos> cursos;

    public Colegio(String nombre) {
        this.nombre = nombre;
    }

    public Colegio(int idColegio, String nombre) {
        this.idColegio = idColegio;
        this.nombre = nombre;
    }

    public Colegio(int idColegio, String nombre, List<Cursos> cursos) {
        this.idColegio = idColegio;
        this.nombre = nombre;
        this.cursos = cursos;
    }

    public int getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(int idColegio) {
        this.idColegio = idColegio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Colegio{" + "idColegio=" + idColegio + ", nombre=" + nombre + ", cursos=" + cursos + '}';
    }

}
