package edu.escuelaing.arsw.ASE.app.MongoDBProject.Service;

import edu.escuelaing.arsw.ASE.app.MongoDBProject.Model.Estudiante;
import edu.escuelaing.arsw.ASE.app.MongoDBProject.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate ahora = LocalDate.now();
        return Period.between(fechaNacimiento, ahora).getYears();
    }

    public List<Estudiante> getAllStudents() {
        return estudianteRepository.findAll();
    }

    public Estudiante getStudentById(String id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    public Estudiante addStudent(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Estudiante updateStudent(String id, Estudiante estudiante) {
        estudiante.setId(id);
        return estudianteRepository.save(estudiante);
    }

    public void deleteStudent(String id) {
        estudianteRepository.deleteById(id);
    }
}

