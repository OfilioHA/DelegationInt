import DelegationInt.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("\nPersonal Universitario\n");

        List<PersonalUniversitario> personal = new ArrayList<PersonalUniversitario>(
            Arrays.asList(
                    new PersonalUniversitario(
                        "1", 
                        "Ofilio Herdocia Aráuz", 
                        "d1",
                        new ArrayList<Descripcion>(
                            Arrays.asList(
                                new Estudiante("UNAN - León", "Ing. en Sistemas"),
                                new Administrativo("CT", 300),
                                new Proyecto("Investigacion I", 800)
                            )
                        )
                    ),
                    new PersonalUniversitario(
                        "2", 
                        "Angie Jazmin Caballero Munguia", 
                        "d2",
                        new ArrayList<Descripcion>(
                            Arrays.asList(
                                new Estudiante("UNAN - León", "Ing. en Sistemas"),
                                new Proyecto("Investigacion II", 1000)
                            )
                        )
                    ),
                    new PersonalUniversitario(
                        "3", 
                        "Miguel Barcenas", 
                        "d3",
                        new ArrayList<Descripcion>(
                            Arrays.asList(
                                new Profesor("CT", 600),
                                new Administrativo("CC", 600)
                            )
                        )
                    )  
            )
        );

        for (int i = 0; i < personal.size(); i++) {
            System.out.println(personal.get(i).descripcion());
        }
    }
}