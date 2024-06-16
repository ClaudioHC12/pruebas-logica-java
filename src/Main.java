import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // boolean val = validarPalindromo("oso");
        // System.out.println(val);

        // boolean valII = validarPalindromoII("12521");
        // System.out.println(valII);

        // boolean val = numeroPerfecto(6);
        // System.out.println(val);

        // FctorialNumero(3);

        // List<Integer> lista = List.of(3, 7, 2, 9, 5);
        // numeroMayor(lista);
        // sumaLista(lista);

        // validarIngredientes();

        //sumaDigitosNumero(12345);

        System.out.println(FuncionesRecursivas.sumaRecursiva(4));
        
    }

    public static boolean validarPalindromo(String palabra) {
        String palindromo = "";
        for (int a = palabra.length() - 1; a >= 0; a--) {
            palindromo += palabra.charAt(a);
        }
        boolean validacion = palabra.equals(palindromo) ? true : false;
        return validacion;
    }

    public static boolean validarPalindromoII(String palabra) {
        int fin = palabra.length() - 1;
        // char cadenaFin, cadenaInic;
        for (int a = 0; a < palabra.length(); a++) {
            // cadenaFin = palabra.charAt(fin);
            // cadenaInic = palabra.charAt(a);
            if (palabra.charAt(fin) != palabra.charAt(a)) {
                return false;
            }
            fin--;
        }
        return true;
    }

    public static boolean numeroPerfecto(int numero) {
        int acumulador = 0;
        for (int a = 1; a < numero; a++) {
            if ((numero % a) == 0) {
                acumulador += a;
            }
        }
        return (numero == acumulador) ? true : false;
    }

    public static void FctorialNumero(int numero) {
        for (int a = numero - 1; a >= 1; a--) {
            numero = numero * a;
        }
        System.out.println(numero);
    }

    public static void numeroMayor(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return;
        } else {
            int inicio = lista.get(0);
            for (int a = 1; a < lista.size(); a++) {
                if (lista.get(a) > inicio) {
                    inicio = lista.get(a);
                }
            }
            System.out.println(inicio);
        }
        System.out.println("numero mayor .I.");
    }

    public static void sumaLista(List<Integer> lista) {
        int acum = 0;
        for (Integer integer : lista) {
            acum += integer;
        }
        System.out.println(acum);
    }

    public static void validarIngredientes() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> ingredientes = new HashMap<>();

        System.out.println("Ingresa ingredientes");
        String linea = "";
        while (!linea.equals("fin")) {
            linea = scanner.nextLine();
            String[] cadenas = linea.split(" ");
            for (int i = 0; i < cadenas.length - 1; i++) {
                if (ingredientes.containsKey(cadenas[i])) {
                    String valor = ingredientes.get(cadenas[i]);
                    if (valor.equals("no")) {
                        ingredientes.put(cadenas[i], cadenas[cadenas.length - 1]);
                    }
                } else {
                    ingredientes.put(cadenas[i], cadenas[cadenas.length - 1]);
                }
            }
        }
        for (Map.Entry<String, String> entrada : ingredientes.entrySet()) {
            String clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println(clave + ": " + valor);
        }
        scanner.close();
    }

    public static void sumaDigitosNumero(int numero) {
        int suma = 0;
        String conversion = String.valueOf(numero);
        String[] arregloDigitos = conversion.split("");
        for (String index : arregloDigitos) {
            suma += Integer.valueOf(index);
        }
        System.out.println(suma);
    }
}