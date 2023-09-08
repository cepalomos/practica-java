/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudDao;

import com.softech.colegio.model.Profesor;
import java.util.List;

/**
 *
 * @author Scorpion
 */
public interface ProfesorDao {

    void agregarProfesor(Profesor profesor);

    void actualizarProfesor(Profesor profesor);

    void eliminarProfesor(int idProfesor);

    Profesor obtenerProfesorPorId(int idProfesor);

    List<Profesor> obtenerTodosLosProfesores();
}
