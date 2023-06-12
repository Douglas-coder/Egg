package egg.POOExercises.PracticalExercises;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/

import java.util.Scanner;

public class Libro {

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

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el titulo del libro");
        setTitulo(sc.nextLine());
        System.out.println("Por favor ingrese el autor del libro");
        setAutor(sc.nextLine());
        System.out.println("Por favor ingrese el numero de paginas del libro");
        setNumPaginas(sc.nextInt());
        System.out.println("Por favor ingrese el ISBN del libro");
        setISBN(sc.nextInt());

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

}
