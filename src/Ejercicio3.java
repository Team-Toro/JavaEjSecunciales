import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
        // Gen de rutinas de ejercicio
        // ingrese condicion fisica (principiante, intermedio, avanzado)
        // genere rutina semanal

        String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        String[] ejer = {"Correr", "Flex Brazo", "Sentadillas", "Plancha"};
        String condicion, linea;
        int x;
        boolean skip = false;
        HashMap<String, Integer> ejercicio = new HashMap<>();
        ejercicio.put("Correr", 20);
        ejercicio.put("Flex Brazo", 10);
        ejercicio.put("Sentadillas", 15);
        ejercicio.put("Plancha", 30);
        System.out.print("Ingrese su condicion fisica (Principiante, intermedio, Avanzado): ");
        Scanner sc = new Scanner(System.in);
        condicion = sc.nextLine().toLowerCase();

        // row -> day | exer | cuanti
        if (condicion.equals("principiante")) {
            x = 2;
        } else if (condicion.equals("intermedio")) {
            x = 1;
            skip = true;
        } else {
            x = 1;
        }

        for (int i = 0; i < 5; i+=x) {
            linea = semana[i] + " | " + ejer[Math.min(i,3)] + " | " + ejercicio.get(ejer[Math.min(i,3)]);
            if (i == 3 && skip) {
                continue;
            }
            System.out.println(linea);
        }
    }
}
