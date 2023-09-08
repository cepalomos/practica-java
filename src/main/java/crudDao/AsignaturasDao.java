/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudDao;

import com.softech.colegio.model.Asignaturas;
import java.util.List;

/**
 *
 * @author Scorpion
 */
public interface AsignaturasDao {

    void agregarAsiganturas(Asignaturas asignatura);

    void actualizarAsignatura(Asignaturas asignatura);

    void eliminarAsiganatura(int idAsignatura);

    Asignaturas obtenerColegioPorId(int idAsignatura);

    List<Asignaturas> obtenerTodosLosColegios();
}
