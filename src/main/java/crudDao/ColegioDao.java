/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudDao;

import com.softech.colegio.model.Colegio;
import java.util.List;

/**
 *
 * @author Scorpion
 */
public interface ColegioDao {

    void agregarColegio(Colegio colegio);

    void actualizarColegio(Colegio colegio);

    void eliminarColegio(int idColegio);

    Colegio obtenerColegioPorId(int idColegio);

    List<Colegio> obtenerTodosLosColegios();
}
