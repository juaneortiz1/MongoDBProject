package edu.escuelaing.arsw.ASE.app.MongoDBProject.Repository;

import edu.escuelaing.arsw.ASE.app.MongoDBProject.Model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {

    List<Estudiante> findByNombre(String nombre);

    List<Estudiante> findByEdad(int edad);

    List<Estudiante> findByPrograma(String programa);
}
