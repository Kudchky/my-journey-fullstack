package exercises.week01;

import exercises.utils.Input;

/* Pedir un número entre 0 y 9_999 y mostrarlo con las cifras al revés.

**PLANTILLA PARA CUALQUIER PROBLEMA**

1. **ANALIZAR**: Entradas/salidas, casos límite
    Entrada: Numero entre 0 y 9_999
    Salida: Numero con cifras al revés
    Casos clave o limite:
                Numero de un solo digito.(5 -> 5)
                Numero 0
                Numero palindromo (12321 -> 12321)
2. **DIVIDIR**: Descomponer en subproblemas más pequeños
        Validar entrada: Numero este en el rango 0-9999.
        Convertir a String para facilitar el recorrido.
        Invertir cadena: recorrer de fin a inicio.
        Convertir de nuevo a entero.
        Mostrar resultado.

3. **DATOS**: Estructuras necesarias (arrays, objetos, etc.)
        String para convertir, almacenar y manipular.
        for para recorrer cadena.

4. **ALGORITMO**: Lógica para cada caso

5. **INTEGRAR**: Unir todas las partes

*/
public class InvertedNumber {
    void main() {
        int num = -1;
        int result;

        while (num < 0 || num > 99999) {
            IO.println("Enter a number between 0 and 9999: ");
            try {
                num = Input.numInteger();

                if (num < 0 || num > 9999) {
                    IO.println("Error: Number must be between 0 and 9999.");
                }
            } catch (NumberFormatException e) {
                IO.println("Error: You just have to enter numbers.");
                num = -1;
            }
        }

        result = invertedNumber(String.valueOf(num));


        IO.println("The number " + num + " inverted is: " + result);

    }

    private static int invertedNumber(String numString) {
        if (numString == null) {
            throw new IllegalArgumentException("The text can't to be null");
        }

        if (numString.isEmpty()) {
            return 0;
        }

        StringBuilder numInverted = new StringBuilder(numString.length());

        for (int i = numString.length() - 1; i >= 0; i--) {
            numInverted.append(numString.charAt(i));
        }

        return Integer.parseInt(numInverted.toString());

    }
}