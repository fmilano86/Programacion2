/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8_ej2;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TP8_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 1) División segura =====");
        divisionSegura(sc);

        System.out.println("\n===== 2) Conversión de cadena a número =====");
        conversionCadenaANumero(sc);

        System.out.println("\n===== 3) Lectura de archivo (FileNotFoundException) =====");
        lecturaArchivoManejandoFNE(sc);

        System.out.println("\n===== 4) Excepción personalizada EdadInvalidaException =====");
        validarEdad(sc);

        System.out.println("\n===== 5) try-with-resources con BufferedReader (IOException) =====");
        lecturaArchivoTryWithResources(sc);

        sc.close();
        System.out.println("\nFin del programa.");
    }

    // ---------- 1) División segura ----------
    private static void divisionSegura(Scanner sc) {
        try {
            System.out.print("Ingrese dividendo (entero): ");
            int a = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Ingrese divisor (entero): ");
            int b = Integer.parseInt(sc.nextLine().trim());

            int resultado = a / b; // Puede lanzar ArithmeticException si b == 0
            System.out.println("Resultado = " + resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Error: división por cero no permitida. " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Entrada inválida: debe ingresar enteros.");
        }
    }

    // ---------- 2) Conversión de cadena a número ----------
    private static void conversionCadenaANumero(Scanner sc) {
        System.out.print("Ingrese un número entero en texto: ");
        String texto = sc.nextLine();
        try {
            int numero = Integer.parseInt(texto.trim()); // Puede lanzar NumberFormatException
            System.out.println("Conversión exitosa. Valor int = " + numero);
        } catch (NumberFormatException ex) {
            System.out.println("No es un entero válido: \"" + texto + "\"");
        }
    }

    // ---------- 3) Lectura de archivo (manejar FileNotFoundException) ----------
    private static void lecturaArchivoManejandoFNE(Scanner sc) {
        System.out.print("Ruta del archivo de texto a leer (modo simple): ");
        String ruta = sc.nextLine();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(ruta)); // Puede lanzar FileNotFoundException
            String linea;
            System.out.println("Contenido:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado: " + ruta);
        } catch (IOException ex) {
            System.out.println("Error de E/S al leer el archivo: " + ex.getMessage());
        } finally {
            // Cierre manual de recursos para este punto
            if (br != null) {
                try { br.close(); } catch (IOException ignored) {}
            }
        }
    }

    // ---------- 4) Excepción personalizada EdadInvalidaException ----------
    private static void validarEdad(Scanner sc) {
        System.out.print("Ingrese edad (0 a 120): ");
        String entrada = sc.nextLine();
        try {
            int edad = Integer.parseInt(entrada.trim());
            verificarEdad(edad); // Puede lanzar EdadInvalidaException
            System.out.println("Edad válida: " + edad);
        } catch (NumberFormatException ex) {
            System.out.println("Entrada inválida: debe ser un número entero.");
        } catch (EdadInvalidaException ex) {
            System.out.println("Edad inválida: " + ex.getMessage());
        }
    }

    private static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120. Valor dado: " + edad);
        }
    }

    // ---------- 5) try-with-resources con BufferedReader (manejar IOException) ----------
    private static void lecturaArchivoTryWithResources(Scanner sc) {
        System.out.print("Ruta del archivo de texto a leer (try-with-resources): ");
        String ruta = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println("Contenido (try-with-resources):");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo: " + ruta);
        } catch (IOException ex) {
            System.out.println("Error de E/S al procesar el archivo: " + ex.getMessage());
        }
    }
}
    

