

package org.generation.lpd5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DiccionarioProgramacion {
    public static void main(String[] args) {

        HashMap<String, String> diccionario = new HashMap<>(); // HasMap: estructura de datos que almacena elementos en pares de clave y valor

        diccionario.put("arreglo", "array"); // Se agrega y guarda la palabra asociada a su traducción dentro del diccionario
        diccionario.put("bucle", "loop");
        diccionario.put("funcion", "function");
        diccionario.put("clase", "class");
        diccionario.put("objeto", "object");
        diccionario.put("metodo", "method");
        diccionario.put("interfaz", "interface");
        diccionario.put("herencia", "inheritance");
        diccionario.put("cadena", "string");
        diccionario.put("entero", "integer");
        diccionario.put("booleano", "boolean");
        diccionario.put("condicional", "conditional");
        diccionario.put("excepcion", "exception");
        diccionario.put("paquete", "package");
        diccionario.put("repositorio", "repository");
        diccionario.put("compilador", "compiler");
        diccionario.put("servidor", "server");
        diccionario.put("base de datos", "database");
        diccionario.put("puerto", "port");
        diccionario.put("registro", "log");

        System.out.println("Total de palabras en el diccionario: " + diccionario.size());

        List<String> palabrasKeys = new ArrayList<>(diccionario.keySet()); // se convierten las claves (palabras español)a una lista para mezclarlas

        Collections.shuffle(palabrasKeys); //for (int i = 0; i < 5; i++) Mezclar la lista de forma aleatoria

        Scanner scanner = new Scanner(System.in);// Comienzan a iniciar los contadores y el Scanner para leer la entrada del usuari
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("\n--- ¡Preparate para comenzar el Quizz de traducción español-inglés de 5 palabras! ---");

        for (int i = 0; i < 5; i++) {
            String palabraEspañol = palabrasKeys.get(i);
            String traduccionInglesCorrecta = diccionario.get(palabraEspañol);

            System.out.print("\n¿Cuál es la traducción al inglés de <<" + palabraEspañol + ">>? ");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();

            if (respuestaUsuario.equals(traduccionInglesCorrecta)) {// Se comprueba si la respuesta es correcta
                System.out.println("¡Correcto :)!");
                correctas++;
            } else {
                System.out.println("Incorrecto :( la respuesta correcta es: " + traduccionInglesCorrecta);
                incorrectas++;
            }
        }

        System.out.println("\n=================================\n       RESULTADOS FINALES        \n=================================");
        System.out.println("Respuestas correctas:   " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}
