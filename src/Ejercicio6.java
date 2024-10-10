import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args) {
        // gen de plan de estudios
        // ingrese horas disponibles por dia
        // convirtirlo a minutos
        // imprimir tirmpo por materia
        Scanner sc = new Scanner(System.in);
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        String materias[] = new String[5];
        materias[0] = "Matematicas";
        materias[1] = "Literatura";
        materias[2] = "Ingles";
        materias[3] = "Intro a La Programacion";
        materias[4] = "Gestion";
        int tiempo;

        System.out.print("Ingrese cantidad de horas disponibles: ");
        tiempo = 60 * sc.nextInt();
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
            System.out.println("-".repeat(dias[i].length()));
            for (int j = 0; j < materias.length; j++) {
                System.out.println(materias[j] + " | " + tiempo/materias.length + " minutos");
            }
            System.out.println();
        }

    }
}
