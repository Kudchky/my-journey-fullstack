package exercises.week01;
/*
Crea un programa que imprima por consola todos los números comprendidos
entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.

**PLANTILLA PARA CUALQUIER PROBLEMA**

1. **ANALIZAR**:
    Entrada: Automatico..
    Salida: Numeros entre 10 y 55 incluidos, pares, ni 16 ni multiplos de 3..
    Casos clave o limite:
            -10 y 55 incluidos
            -16 excluido
            -multiplos de 3 excluidos ( 16,18,24,30,36,42,48,54)

2. **DIVIDIR**: Descomponer en subproblemas más pequeños
            Hacer bucle for para generar rango.
                Incluir 10 y 55
            Condiciones excluyentes:
                Numero = 16
                Numero sea multiplo de 3

3. **DATOS**: Estructuras necesarias (arrays, objetos, etc.)
        for para recorrer cadena y generar numeros
        condicionales.

4. **ALGORITMO**: Lógica para cada caso
        1. validar rango: (0 and 9999)
        2. validar si numero no es numerico.
        3. convertir numero a string
        4. convertir numero a su inverso.
        5. comparar numero con su inverso.
        5. mostrar numero es capicua o no es capicua.

5. **INTEGRAR**: Unir todas las partes


*/

public class PrintNumber {
    void main() {
        for (int i = 10; i <= 55; i+=2) {
            if (i == 16 || i % 3 == 0) {
                if (i == 54) {
                    System.out.println(i + 1);
                }
               continue;
            }

            System.out.println(i);
        }
    }

}
