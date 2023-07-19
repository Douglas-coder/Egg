package egg.POOExercises.PracticalExercises;

/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
* Un constructor por defecto.
* Un constructor con todos los atributos como parámetro.
* Métodos getters y setters de cada atributo.
* método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
* Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
* Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Curso {

    Scanner sc = new Scanner(System.in);
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadHorasPorSemana;
    private String turno;
    private int selecTurno;
    private int precioPorHora;
    //Creacion variable Harcode para ahorra el ingreso de datos por pantalla
    private String[] alumnosHard = {"Douglas", "Laura", "Juan", "Sofia", "Robin"};
    private List alumnos= new ArrayList<>();
    //private String[] alumnos = new String[6];

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadHorasPorSemana, String turno, int selecTurno, int precioPorHora, String[] alumnos, String[] alumnosHard) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
        this.turno = turno;
        this.selecTurno = selecTurno;
        this.precioPorHora = precioPorHora;
        this.alumnosHard = alumnosHard;
        this.alumnos = List.of(alumnos);
    }

    public Curso() {
        getCrearCurso();
        System.out.println();
        getMostrarDatos();
    }

    //?Metodo para Crear los alumnos
    public void getCargarAlumnos() {
        for (int x = 0; x <= 4; x++) {
            System.out.println("Alumno # " + (x + 1));
            alumnos.add(sc.nextLine());
        }
    }

    //?Metodo crear Cursos
    public void getCrearCurso() {

        getCargarAlumnos();
        /*System.out.println("Ingresa el nombre del curso:");
        setNombreCurso(sc.nextLine());*/
        setNombreCurso("Programación");
        /*System.out.println("Ingresa la cantidad de horas por día:");
        setCantidadHorasPorDia(sc.nextInt());*/
        setCantidadHorasPorDia(5);
        /*System.out.println("Ingresa la cantidad de días por semana:");
        setCantidadHorasPorSemana(sc.nextInt());*/
        setCantidadHorasPorSemana(5);
        System.out.println("Por favor indique el turno:");
        System.out.println("1- Mañana");
        System.out.println("2- Tarde");
        setSelecTurno(sc.nextInt());
        switch (selecTurno) {
            case 1:
                setTurno("Mañana");
                break;
            case 2:
                setTurno("Tarde");
                break;
            default:
                System.out.println("Opcion invalida.");
        }
            /*System.out.println("Ingrese el precio por hora:");
            setPrecioPorHora(sc.nextInt());*/
        setPrecioPorHora(5000);

    }

    //Uso de (toString()) para imprimir de forma mas rapida la informacion de los atributos
    @Override
    public String toString() {
        // se usa '\n' para hacer un salto de linea
        return "Lista alumnos: " + Arrays.toString(new List[]{alumnos}) + '\n' +
                "Nombre curso: " + nombreCurso + '\n' +
                "Horas por día: " + cantidadHorasPorDia + '\n' +
                "Días por semana: " + cantidadHorasPorSemana + '\n' +
                "Turno: " + turno + '\n' +
                "Precio por hora: " + precioPorHora + '\n' +
                "Total: " + getCalcularGananciaSemanal() + '\n';
    }

    //?Metodo para mostrar los datos
    public void getMostrarDatos() {

        for (int x = 0; x < alumnos.size(); x++) {
            System.out.println("Nombre alumno: " + alumnos.get(x));
            System.out.println("Nombre del curso: " + getNombreCurso());
            System.out.println("Horas por día: " + getCantidadHorasPorDia());
            System.out.println("Días por semana: " + getCantidadHorasPorSemana());
            System.out.println("Turno: " + getTurno());
            System.out.println("Total: " + getCalcularGananciaSemanal());
            System.out.println("");
        }

        /*for (int x = 0; x < alumnosHard.length; x++) {
            System.out.println("Nombre alumno: " + alumnosHard[x]);
            System.out.println("Nombre del curso: " + getNombreCurso());
            System.out.println("Horas por día: " + getCantidadHorasPorDia());
            System.out.println("Días por semana: " + getCantidadHorasPorSemana());
            System.out.println("Turno: " + getTurno());
            System.out.println("Total: " + getCalcularGananciaSemanal());
            System.out.println("");
        }*/

    }

    //?Metodo para Saber las ganancias
    public double getCalcularGananciaSemanal() {
        return cantidadHorasPorDia * precioPorHora * alumnosHard.length * cantidadHorasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getSelecTurno() {
        return selecTurno;
    }

    public void setSelecTurno(int selecTurno) {
        this.selecTurno = selecTurno;
    }

    public String[] getAlumnosHard() {
        return alumnosHard;
    }

    public void setAlumnosHard(String[] alumnosHard) {
        this.alumnosHard = alumnosHard;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadHorasPorSemana() {
        return cantidadHorasPorSemana;
    }

    public void setCantidadHorasPorSemana(int cantidadHorasPorSemana) {
        this.cantidadHorasPorSemana = cantidadHorasPorSemana;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public List getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = List.of(alumnos);
    }
}
