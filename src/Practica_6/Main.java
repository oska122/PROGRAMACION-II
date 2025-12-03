package Practica_6;

public class Mai {
    public static void main(String[] args) {

        Horario horario = new Horario("Lunes a Viernes", "08:00", "18:00");
        Biblioteca biblioteca = new Biblioteca("UMSA - Central", horario);

        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        biblioteca.agregarAutor(autor1);

        Libro libro1 = new Libro("Cien años de soledad", "123ABC");
        libro1.agregarPagina(new Pagina(1, "Muchos años después..."));
        libro1.agregarPagina(new Pagina(2, "El mundo era tan reciente..."));
        biblioteca.agregarLibro(libro1);

        Estudiante est1 = new Estudiante("20241001", "Juan Pérez");
        biblioteca.prestarLibro(est1, libro1, "09/06/2025", "15/06/2025");

        biblioteca.mostrarEstado();

        System.out.println("\nLeyendo libro:");
        libro1.leer();

        biblioteca.cerrarBiblioteca();
    }
}
