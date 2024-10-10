import javax.swing.*;

public class Ejercicio7 {
    public static void main (String[] args) {
        // Calculadora de Indice de Felicidad
        // ingrese satisfacion con vida, nivel de estres, nivel de salud
        // print indice basado en esos factores
        byte vida, estres, salud;
        vida = Byte.parseByte(JOptionPane.showInputDialog("Ingrese en escala de 1-10 su satisfacion con la vida: "));
        estres = Byte.parseByte(JOptionPane.showInputDialog("Ingrese en escala de 1-10 su nivel de estres: "));
        salud = Byte.parseByte(JOptionPane.showInputDialog("Ingrese en escala de 1-10 su nivel de salud: "));

        JOptionPane.showMessageDialog(null, "Su indice de Felicidad es: " + (vida + estres + salud)/3);
    }
}
