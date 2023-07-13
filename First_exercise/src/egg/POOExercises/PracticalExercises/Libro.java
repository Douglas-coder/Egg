package egg.POOExercises.PracticalExercises;

/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/

import java.util.Scanner;

public class Libro {

    Scanner sc = new Scanner(System.in);
    private String titulo;
    private String autor;
    private int numPaginas;
    private int ISBN;

    public Libro(String titulo, String autor, int numPaginas, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }

    public Libro() {

        crearLibro(sc);

    }

    private void crearLibro(Scanner sc) {
        System.out.println("Por favor ingrese el titulo del libro");
        setTitulo(sc.nextLine());
        System.out.println("Por favor ingrese el autor del libro");
        setAutor(sc.nextLine());
        System.out.println("Por favor ingrese el numero de paginas del libro");
        setNumPaginas(sc.nextInt());
        System.out.println("Por favor ingrese el ISBN del libro");
        setISBN(sc.nextInt());
        System.out.println();
    }

    @Override
    public String toString() {
        return  "ISBN: " + ISBN + '\n' +
                "Titulo: " + titulo + '\n' +
                "Autor: " + autor + '\n' +
                "Numero de paginas: " + numPaginas + '\n';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

}
