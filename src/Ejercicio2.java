import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {
    public static void main (String[] args) {
        // Calculadora de Calorias quemadas

        // Ingrese peso (kg)
        // Ingrese duracion del ejercicio (min)
        // Ingrese tipo de ejercicio (correr, nadar, andar en bici)

        // calcule e imprime calorias quemadas
        // tasas de calorias quemasdas por minuto para cada tipo de ejercicio
        int peso, tiempo, calorias;
        String opcion;
        HashMap<String, Integer> dict = new HashMap<>();

        dict.put("correr", 10);
        dict.put("nadar", 8);
        dict.put("andar en bici", 6);
        dict.put("caminar", 4);
        dict.put("patinar", 7);

        peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso en KG:"));
        tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su tiempo de ejerecicio en minutos:"));
        opcion = (JOptionPane.showInputDialog("1. correr, 2. nadar, 3. andar en bici, 4. caminar, 5. patinar.\nIngrese su ejerecicio (palabra igual a como esta escrito):"));
        calorias = dict.get(opcion) * tiempo * (peso/70);

        JOptionPane.showMessageDialog(null, "Calorias quemadas: " + calorias);
    }
}
