package edu.escuelaing.arsw.ASE.app.MongoDBProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.Period;

@Document(collection = "estudiantes")
public class Estudiante {

    @Id
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int edad;
    private String correo;
    private String programa;

    // Constructor vacío
    public Estudiante() {}

    // Constructor con parámetros
    public Estudiante(String nombre, LocalDate fechaNacimiento, int edad, String correo, String programa) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad =edad;
        this.correo = correo;
        this.programa = programa;
    }

    public int getEdad() {
        return edad;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return String.format(
                "Estudiante[id=%s, nombre='%s', edad=%d, correo='%s', programa='%s']",
                id, nombre, edad, correo, programa);
    }
}