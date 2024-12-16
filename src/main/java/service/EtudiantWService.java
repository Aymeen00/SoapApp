package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import model.Student;
import enums.Genre;

import java.util.List;
import java.util.ListResourceBundle;

@WebService(serviceName="serviceWeb")
public class EtudiantWService {
    @WebMethod(operationName = "listStudents")
    public List<Student> listStudents() {
        return List.of(
                new Student(1,"ET_Nom1","ET_Prénom1", Genre.Homme),
                new Student(2 ,"ET_Nom2","ET_Prénom2", Genre.Femme),
                new Student(3 ,"ET_Nom3","ET_Prénom3", Genre.Homme)
        );
    }
}
