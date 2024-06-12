import java.util.Date;

public class Persona {

    private int id;
    private String nombre_P;
    private String apellido_p;
    private String fechaDeNacimiento;
    private String estado;

    public Persona(int id, String nombre_P, String apellido_p, String fechaDeNacimiento, String estado){
        this.id = id;
        this.nombre_P = nombre_P;
        this.apellido_p = apellido_p;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    public int getId(){ return id; }

    public String getNombre(){ return nombre_P; }

    public String getApellido(){ return apellido_p; }

}
