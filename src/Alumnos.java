import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {

        //Creamos el alummno de referencia pasandole parametros

        Alumno al = new Alumno(5,5,5,5);

        double notaMedia1 = al.notaMedia();

        System.out.println("La nota media del alumno de referencia es : " + notaMedia1);

        //Creamos ahora el Alummno 1 pidiendo sus notas

        Alumno al1 = new Alumno();

        System.out.println("Escribe en consola la nota de Historia");
        Scanner scanner = new Scanner(System.in);
        al1.notaHistoria = scanner.nextDouble();
        System.out.println("Escribe en consola la nota de Inglés");
        al1.notaIngles = scanner.nextDouble();
        System.out.println("Escribe en consola la nota de Matemáticas");
        al1.notaMatematicas = scanner.nextDouble();
        System.out.println("Escribe en consola la nota de Lengua");
        al1.notaLengua = scanner.nextDouble();

        double notaMedia2 = al1.notaMedia();

        System.out.println("La nota media del alumno introducido es "+ notaMedia2);

        if (notaMedia1<notaMedia2)
            System.out.println("la nota media del alumno introducido es mayor que la referencia");
        else System.out.println("la nota media del alumno introducido es menor que la referencia");




    }



}
