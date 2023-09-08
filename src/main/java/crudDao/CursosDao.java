/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudDao;
import com.softech.colegio.model.Cursos;
import java.util.List;


/**
 *
 * @author Scorpion
 */
public interface CursosDao {
    
    void agregarCursos(Cursos cursos);

    void actualizarCurso(Cursos curso);

    void eliminarCurso(int idCurso);

    Cursos obtenerCursoPorId(int idCurso);

    List<Cursos> obtenerTodosLosCursos();
}
