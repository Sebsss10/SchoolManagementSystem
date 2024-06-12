public class Curso {

    private int id;
    private String nombre_C;
    private String descripcion;
    private int numeroCreditos;
    private String version;

    public Curso(int id, String nombre_C, String descripcion, int nCreditos, String version){
        this.id = id;
        this.nombre_C = nombre_C;
        this.descripcion = descripcion;
        this.numeroCreditos = nCreditos;
        this.version = version;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){ return nombre_C; }

}
