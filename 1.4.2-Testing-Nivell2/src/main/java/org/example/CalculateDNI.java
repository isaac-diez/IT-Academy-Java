package org.example;

public class CalculateDNI {

// se toma el número completo del DNI, se divide entre 23 y se obtiene el resto
// de esa división. Ese resto se asocia a una letra específica de un listado
// predefinido de 23 letras (la primera // se asocia al 0 y la última al 22),
// que son: T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E.

    private int idNumber;

    public CalculateDNI() {
    }

    public String calculateLetter(int idNumber) {

        String fullIdNumber = "";

        int remainder = idNumber % 23;
        String letter = switch (remainder) {
            case 0 -> "T";
            case 1 -> "R";
            case 2 -> "W";
            case 3 -> "A";
            case 4 -> "G";
            case 5 -> "M";
            case 6 -> "Y";
            case 7 -> "F";
            case 8 -> "P";
            case 9 -> "D";
            case 10 -> "X";
            case 11 -> "B";
            case 12 -> "N";
            case 13 -> "J";
            case 14 -> "Z";
            case 15 -> "S";
            case 16 -> "Q";
            case 17 -> "V";
            case 18 -> "H";
            case 19 -> "L";
            case 20 -> "C";
            case 21 -> "K";
            case 22 -> "E";
            default -> "";
        };

        fullIdNumber = idNumber + letter;

        return fullIdNumber;

    }
}