import javax.swing.*;

public class Ejercicio4 {
    public static void main (String[] args) {
        // ingrese estado de lista
        // devuelve array

        String[] happinessSongs = {
                "Happy",
                "Don't Stop Me Now",
                "Good Life"
        };

        // Array de canciones de tristeza
        String[] sadnessSongs = {
                "Someone Like You",
                "Fix You",
                "Hurt"
        };

        // Array de canciones de energía
        String[] energeticSongs = {
                "Eye of the Tiger",
                "Uptown Funk",
                "Can't Hold Us"
        };

        // Array de canciones de relajación
        String[] relaxedSongs = {
                "Weightless",
                "Clair de Lune",
                "The Sound of Silence"
        };
        String[][] array = new String[4][];
        int choice;
        String display = "";

        array[0] = happinessSongs;
        array[1] = sadnessSongs;
        array[2] = energeticSongs;
        array[3] = relaxedSongs;

        choice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese estado de animo\n1. Feliz, 2. Triste, 3. Energetico, 4. Relajado"));
        for (int i = 0; i < 3; i++) {
            display = display.concat("- "+array[choice-1][i]+"\n");
        }
        JOptionPane.showMessageDialog(null, "Aca tiene un playlist para su estado de animo:\n" + display);
    }
}
