import DelegationInt.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Descripcion d1 = new Profesor("CC", 1600);
        Descripcion d2 = new Estudiante("Alcala", "Informática");
        Descripcion d3 = new Estudiante("Alcala", "Doctorado en Informática");

        //Creamos 3 personas
        PersonalUniversitario pu1 = new PersonalUniversitario(
            "1", 
            "Pepe", 
            "d1",
            new ArrayList<Descripcion>(
                Arrays.asList(
                    new Estudiante("Alcala", "Informática"),
                    new Profesor("CC", 1600)
                )
            )
        );

        System.out.println(pu1.descripcion());
        //PersonalUniversitario pu2 = new PersonalUniversitario("2", "Sonia", "d2");
        //PersonalUniversitario pu3 = new PersonalUniversitario("3", "Jose", "d3");
        //PersonalUniversitario pu4 = new PersonalUniversitario("4", "Maria", "d4");
        //PersonalUniversitario pu5 = new PersonalUniversitario("5", "Dolores", "d5");        
        //PersonalUniversitario pu6 = new PersonalUniversitario("6", "Escroto", "d6");

    }
}