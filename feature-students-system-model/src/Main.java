public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(1, "Daniel", "Hernandez", "05-05-2003", "Graduando");
        Estudiante estudiante2 = new Estudiante(2, "Bruno", "Valle", "23-02-1983", "Graduado");

        Curso curso = new Curso(1, "Matemáticas", "Derivadas", 30, "versión 2");
        Curso curso2 = new Curso(2, "Alegebra Lineal", "Ecuaciones 2X2", 14, "versión 1.1");

        GestorAcademico gestoracademico = new GestorAcademico();

        gestoracademico.matricularEstudiante(estudiante1);
        System.out.println();

        gestoracademico.agregarCurso(curso);
        System.out.println();

        gestoracademico.inscribirEstudianteCurso(estudiante1, curso.getId());
        gestoracademico.inscribirEstudianteCurso(estudiante2, curso2.getId());
        gestoracademico.inscribirEstudianteCurso(estudiante2, curso2.getId());

        System.out.println();
        gestoracademico.desinscribirEstudianteCurso(estudiante1.getId(), curso.getId());
        gestoracademico.desinscribirEstudianteCurso(estudiante2.getId(), curso.getId());

    }
}