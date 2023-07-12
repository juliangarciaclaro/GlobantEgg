package practica.imprimir.rectangulo;

public class PracticaImprimirRectangulo {

    public static void main(String[] args) {

        int base = 15;
        int altura = 7;

  for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}