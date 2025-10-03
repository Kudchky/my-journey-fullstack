package exercises.week02;

/*📌
🎯 Objetivo: Practicar variables primitivas (double) y operadores aritméticos.
        📖 Aprende a trabajar con fórmulas matemáticas simples en Java.
📝 Tarea: Pide al usuario una temperatura en Celsius y muestra su equivalente en Fahrenheit y Kelvin.
        Fórmulas:
F = (C * 9/5) + 32
K = C + 273.15
*/

import java.util.Scanner;

public class TemperatureConverter {
    void main() {
        double celsius, fahrenheit, kelvin;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);

        while (!flag) {
            IO.println("Enter temperature in celsius: ");

            if (sc.hasNextDouble()) {
                celsius = sc.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                IO.println(celsius + "°C is: " + fahrenheit + "°F");
                IO.println(celsius + "°C is: " + kelvin + "°K");
                flag = true;
            } else {
                IO.println("Error: Please enter a valid number!");
                sc.next();
            }
        }


        sc.close();
    }
}
