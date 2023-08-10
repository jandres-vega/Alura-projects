public class Persona {
    private String nombre;
    private int anoNacimiento;

    public Persona(String nombre, int anoNacimiento){
        this.nombre = nombre;
        this.anoNacimiento = anoNacimiento;
    }

    public int calcularEdad(int anoEnCurso, int anoNacimiento){
        if (anoEnCurso > anoNacimiento){
            return anoEnCurso - anoNacimiento;
        }
        return 18;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }
}
