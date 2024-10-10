import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args) {
        // Calculadora de Costo de Viaje
        // ingrese distancia (km), consumo (L/km), precio (ARS por litro)
        // imprime costo
        int distancia;
        float precio, consumo, costo;
        distancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese distancia: "));
        consumo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese consumo: "));
        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese precio: "));
        costo = distancia * consumo * precio;
        JOptionPane.showMessageDialog(null, "Costo del viaje: "+costo);
    }
}
