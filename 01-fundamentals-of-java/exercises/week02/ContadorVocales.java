package exercises.week02;
/*🎯 Objetivo: Trabajar con cadenas y loops.

📖 Aprenderás a recorrer caracteres de un String y usar condiciones.

    📝 Tarea: Solicita una frase y cuenta cuántas vocales tiene.

    💡 Pista: Convierte el string en minúsculas y recórrelo con un for. Usa charAt(i) y
        compara con 'a', 'e', 'i', 'o', 'u'.
 */

import java.util.Scanner;
import java.util.Set;

public class ContadorVocales {
    public static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter a phrase please: ");
        String text = sc.nextLine();
        sc.close();

        int count = countVowels(text);
        IO.println("La palabra tiene " + count + " vocales");


    }

    public static int countVowels(String text) {
        int count = 0;

        if (text == null || text.isEmpty()) {
            IO.println("Text empty");
            return 0;
        }

        for (char letter: text.toLowerCase().toCharArray()) {
            if (VOWELS.contains(letter)) {
                count += 1;
            }
        }

        return count;
    }
}
