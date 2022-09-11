package DelegationInt;

public class Administrativo implements Descripcion {

    private String departamento;
    private double sueldo;

    public Administrativo(String departamento, double sueldo) {
        this.departamento = departamento;
        this.sueldo = sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String descripcion() {
        return 
            this.getDepartamento() + " - " + 
            this.getSueldo() + " - " +
            this.getClass().getSimpleName();
    }
}
