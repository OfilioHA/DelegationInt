package DelegationInt;

public class Proyecto implements Descripcion {

    private String nombre;
    private double presupuesto;

    public Proyecto(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String descripcion() {
        return 
            this.getNombre() + " - " + 
            this.getPresupuesto() + " - " +
            this.getClass().getSimpleName();
    }
}
