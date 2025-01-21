package org.example;

public class CalculateDNI {

// se toma el número completo del DNI, se divide entre 23 y se obtiene el resto
// de esa división. Ese resto se asocia a una letra específica de un listado
// predefinido de 23 letras (la primera // se asocia al 0 y la última al 22),
// que son: T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E.

    public String calculateLetter(int idNumber) {

        String fullIdNumber;

        int remainder = idNumber % 23;
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";

        String letter = String.valueOf(letters.charAt(remainder));

        fullIdNumber = idNumber + letter;

        return fullIdNumber;

    }
}