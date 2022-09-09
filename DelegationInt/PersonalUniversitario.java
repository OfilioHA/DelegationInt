package DelegationInt;

import java.util.*;

public class PersonalUniversitario {

    private String dni;
    private String nombre;
    private String direccion;
    private List<Descripcion> roles;

    public PersonalUniversitario(
        String dni,
        String nombre, 
        String direccion,
        List<Descripcion> roles
    ) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        //this.roles = new ArrayList<>();
        this.roles = roles;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List getRoles() {
        return roles;
    }

    public void setRoles(List<Descripcion> roles) {
        this.roles = roles;
    }

    // asignamos un nuevo rol a la persona
    public void setRol(Descripcion rol) {
        this.roles.add(rol);
    }

    // borramos un nuevo rol de la persona
    public void borraRol(Descripcion rol) {
        this.roles.remove(rol);
    }

    public String descripcion() {
        String desc = this.dni + " - " + this.nombre + " - " + this.direccion + "\n";
        for (int i = 0; i < roles.size(); i++) {
            desc += roles.get(i).descripcion() + "\n"; //delegación
        }
        return desc;
    }
}
