package com.softech.colegio.model;

import java.util.List;


public class Colegio {
    private String nombre;
    private List<Cursos> cursos;

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
    
    
}
