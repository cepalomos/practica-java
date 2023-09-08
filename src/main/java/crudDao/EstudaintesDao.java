/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudDao;

import com.softech.colegio.model.Estudiantes;
import java.util.List;

/**
 *
 * @author Scorpion
 */
public interface EstudaintesDao {

    void agregarEstudiantes(Estudiantes estudiantes);

    void actualizarEstudiantes(Estudiantes estudiantes);

    void eliminarEstudiantes(int idEstudiantes);

    Estudiantes obtenerEstudiantesPorId(int idEstudiantes);

    List<Estudiantes> obtenerTodosLosEstudiantes();
}
