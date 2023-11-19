public class Main {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String professor = "Andres Guzman";

        String detalle = curso + " con el instructor " + professor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" con ").concat(professor);
        System.out.println("detalle2 = " + detalle2);
    }
}