import java.util.Scanner;

class MutantDetector {

    private static boolean validarSecuencia(String dna) { //Función para validar que los datos ingresados sean validos
        String validChars = "ATCG";
        return dna.length() == 6 && dna.chars().allMatch(c -> validChars.indexOf(c) != -1);
    }

    private static boolean isMutant(String[] dna) { //Función isMutant
        int rows = dna.length;
        int cols = dna[0].length();
        int sequencesCount = 0;

        int[][] directions = {{0, 1}, {1, 0}, {1, 1}, {-1, 1}};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int[] direction : directions) {
                    int dx = direction[0];
                    int dy = direction[1];

                    if (0 <= i + 3 * dx && i + 3 * dx < rows && 0 <= j + 3 * dy && j + 3 * dy < cols) {
                        if (dna[i].charAt(j) == dna[i + dx].charAt(j + dy) &&
                                dna[i].charAt(j) == dna[i + 2 * dx].charAt(j + 2 * dy) &&
                                dna[i].charAt(j) == dna[i + 3 * dx].charAt(j + 3 * dy)) {
                            sequencesCount++;
                            if (sequencesCount > 1) {
                                return true;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Entrada de datos para ADN
        String[] dna = new String[6];
        for (int i = 0; i < 6; i++) {
            boolean filaValida = false;
            while (!filaValida) {
                System.out.print("Ingrese la fila " + (i + 1) + " de ADN (debe contener 6 letras A, T, C o G, y no debe contener espacios): ");
                String fila = scanner.nextLine().toUpperCase();
                filaValida = validarSecuencia(fila);
                if (!filaValida) {
                    System.out.println("La fila ingresada no es válida. Por favor, inténtelo nuevamente.");
                } else {
                    dna[i] = fila;
                }
            }
        }

        //Verificacion booleana para guardar dentro de la variable mutant si el ADN es de mutante o no (verdadero en caso de ser mutante y falso si no lo es)
        boolean mutant = isMutant(dna);

        //Aca se imprime en pantalla si el ADN es de mutante o no
        if (mutant) {
            System.out.println("El humano es mutante.");
        } else {
            System.out.println("El humano no es mutante.");
        }
    }
}