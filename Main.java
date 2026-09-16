import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);



        System.out.println("Sistema de Registro de Notas");



// 1. Registro del profesor

        System.out.print("Ingrese el nombre del profesor: ");

        String nombreProfe = scanner.nextLine();



        System.out.print("Ingrese la asignatura: ");

        String asignatura = scanner.nextLine();



        Profesor profe = new Profesor(nombreProfe, asignatura);



// 2. Registro de estudiantes

        List<Estudiante> estudiantes = new ArrayList<>();



        boolean registrarOtro = true;

        int contador = 1;



        while (registrarOtro) {



            System.out.println("\n--- Registro del Estudiante #" + contador + " ---");



            System.out.print("Ingrese el nombre del estudiante: ");

            String nombreEstudiante = scanner.nextLine();



            System.out.print("Nota inicial del estudiante (0.0 a 5.0): ");

            double nota = Double.parseDouble(scanner.nextLine());



            System.out.print("¿Es colaborador estrella? (Si/No): "); //Colaborador estrella: Que le ayuda y explica a quienes necesiten

            String respuestaColaborador = scanner.nextLine().trim().toLowerCase();



            boolean esColaborador = respuestaColaborador.equals("si") || respuestaColaborador.equals("sí");



// Registro del estudiante

            Estudiante estudiante = new Estudiante(nombreEstudiante, nota, esColaborador);



            estudiantes.add(estudiante);



// Preguntar si desea registrar otro estudiante

            System.out.print("\n¿Desea registrar otro estudiante? (Si/No): ");

            String continuar = scanner.nextLine().trim().toLowerCase();



            if (!continuar.equals("si")) {

                registrarOtro = false;

            }



            contador++;

        }



// 3. Evaluar bonificación por colaboración

        for (Estudiante estudiante : estudiantes) {

            estudiante.evaluarColaboracion();

        }



// 4. Reporte final

        System.out.println("\n==========================================");



        profe.mostrarDetalles();



        System.out.println("==========================================");

        System.out.println("LISTADO FINAL DE ESTUDIANTES Y NOTAS:");



        for (Estudiante est : estudiantes) {

            est.mostrarDetalles();

        }



        System.out.println("==========================================");



        scanner.close();

    }

}

