package Exceptions;

public class EstudianteNoInscritoEnCursoException extends Exception{

    public EstudianteNoInscritoEnCursoException(){
        super("El estudiante no se encuentra inscrito");
    }

}
