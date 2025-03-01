package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *  Clase que contiene libros y que permite agregar, eliminar y consultar libros
 *
 * @version 2025.03.01
 * @author CAAR
 * @see Libro
 */

public class Biblioteca {

    /**
     * Lista de libros que hay en la biblioteca
     */
    private final List<Libro> libros;

    /**
     * Constructor por defecto
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor con parámetros
     * @param libros Lista de libros
     */

    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Metodo para agregar libros
     * @param libro
     * @return {@code true} si el libro se ha añadido
     * o {@code false} si el libro no se ha añadido
     */

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Metodo para eliminar libros
     * @param libro
     * @return {@code true} si el libro se ha eliminado
     *      * o {@code false} si el libro no se ha eliminado
     */

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     *
     * @return
     */

    // TODO: Documentar este método
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}