package DelegationInt;

public class Estudiante implements Descripcion {

    private String universidad;
    private String titulacion;

    public Estudiante(String universidad, String titulacion) {
        this.universidad = universidad;
        this.titulacion = titulacion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String descripcion() {
        return this.getUniversidad() + " - " + this.getTitulacion();
    }
}
