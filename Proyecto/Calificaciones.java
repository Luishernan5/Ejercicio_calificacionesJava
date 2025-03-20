package Proyecto;
import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        int promedioUnidad = 0, filas = 5;
        int sumaCalificaciones = 0;
        int sumaPromedios = 0;
        int promedioFinal = 0;
        int columnas = 5;
        int[][] calif = new int[filas][columnas];

        String encabezado[] = {"      ", "|  UNIDAD 1|", "|  UNIDAD 2|", "|  UNIDAD 3|", 
        "|  UNIDAD 4|", "|  UNIDAD 5|", "PROMEDIO"};

        for (int i = 0; i < 7; i++) {
            System.out.print(encabezado[i] + "\t ");
        }

        System.out.println("");

        for (int j = 0; j < 6; j++) {
            String lateral[] = {"|Calculo |", "|Matemat |", "|Funda P |",
                "|Funda I |", "|Quimica |", "|Desar S |"};
            System.out.print(lateral[j]);

            // Imprimir la matriz de Calificaciones.
            System.out.print("");
            for (byte fila = 0; fila < 1; fila++) {
                for (byte columna = 0; columna < 5; columna++) {
                    calif[fila][columna] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu calificación"));
                    System.out.print("     " + calif[fila][columna] + "      \t ");
                    sumaCalificaciones += calif[fila][columna];
                    promedioUnidad = sumaCalificaciones / 5;
                }
                System.out.print("   " + promedioUnidad);
                sumaCalificaciones = 0;
            }

            System.out.println("");
            sumaPromedios += promedioUnidad;
            promedioFinal = sumaPromedios / 6;
        }

        System.out.println("");
        System.out.println("El promedio final es:  " + promedioFinal);
        sumaPromedios = 0;
    }
}