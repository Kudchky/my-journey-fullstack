package exercises.week01;

/*
Pedir un número entre 0 y 9.999, decir si es capicúa.
**PLANTILLA PARA CUALQUIER PROBLEMA**

1. **ANALIZAR**: Entradas/salidas, casos límite
    Entrada: Number between 0 and 9_999.
    Salida: Number capicua 123 -> 321 (F), 323 o no capicua o no capicua.
    Casos clave o limite:
                Numeros de 0-9 capicuas.
                Entrada no numericas

2. **DIVIDIR**: Descomponer en subproblemas más pequeños
        Validar entrada: Numero este en el rango 0-9999.
        Verificar capicua: Comparar numero con su inverso.
        Mostrar si es capicua o no..

3. **DATOS**: Estructuras necesarias (arrays, objetos, etc.)
        String para convertir..
        Usar StringBuilder para manipular Strings
        for para recorrer cadena.

4. **ALGORITMO**: Lógica para cada caso
        1. validar rango: (0 and 9999)
        2. validar si numero no es numerico.
        3. convertir numero a string
        4. convertir numero a su inverso.
        5. comparar numero con su inverso.
        5. mostrar numero es capicua o no es capicua.

5. **INTEGRAR**: Unir todas las partes


*/

import exercises.utils.Input;

public class NumberCapicua {
    void main() {
        String number = validarNumber();
        boolean result = capicua(number);

        if (result) {
            IO.println("The number " + number + " is capicua...");
        } else {
            IO.println("The number " + number + " is not capicua");
        }
    }

    private static String validarNumber() {
        int number = -1;

        while (number < 0 || number > 99_999) {
            IO.println("Enter a number between 0 and 99_999: ");

            try {
                number = Input.numInteger();

                if (number < 0 || number > 99_999) {
                    IO.println("Error: You must enter a number between 0 and 9_999");
                }
            } catch (NumberFormatException e) {
                IO.println("Erro: You must only enter a number, no text");
                number = -1;
            }
        }

        return String.valueOf(number);
    }

    private static boolean capicua(String number) {
        String numberReverse = new StringBuilder(number).reverse().toString();

        return number.equals(numberReverse);
    }

}
