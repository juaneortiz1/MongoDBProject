package edu.escuelaing.arsw.ASE.app.MongoDBProject.Controller;

import edu.escuelaing.arsw.ASE.app.MongoDBProject.Model.Estudiante;
import edu.escuelaing.arsw.ASE.app.MongoDBProject.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> getAllStudents() {
        return estudianteService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Estudiante getStudentById(@PathVariable String id) {
        return estudianteService.getStudentById(id);
    }

    @PostMapping
    public Estudiante addStudent(@RequestBody Estudiante estudiante) {
        return estudianteService.addStudent(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante updateStudent(@PathVariable String id, @RequestBody Estudiante estudiante) {
        return estudianteService.updateStudent(id, estudiante);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        estudianteService.deleteStudent(id);
    }
}
