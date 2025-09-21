package exercises.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    static String initialize() {
        String buzon = "";
        InputStreamReader flow = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(flow);
        try {
            buzon = keyboard.readLine();
        } catch (Exception e) {
            System.out.append("Input error");
        }
        return buzon;
    }

    public static int numInteger(){
        return Integer.parseInt(initialize());
    }

    public static double numDouble(){
        return Double.parseDouble(initialize());
    }

    public static String chain(){
        return initialize();
    }

    public static char letter(){
        return initialize().charAt(0);
    }
}
