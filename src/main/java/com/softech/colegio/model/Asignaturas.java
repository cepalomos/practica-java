/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softech.colegio.model;

import java.util.List;

/**
 *
 * @author Scorpion
 */
public class Asignaturas {

    private String nombre;
    private Profesor profesor;
    private List<Estudiantes> estudiantes;
    private Cursos curso;

    public Asignaturas() {
    }

    public Asignaturas(String nombre, Profesor profesor, List<Estudiantes> estudiantes, Cursos curso) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
        this.curso = curso;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

}
