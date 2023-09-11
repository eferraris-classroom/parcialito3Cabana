package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        int[] lista1 = {5, 8, 15, 20};
        int[] lista2 = {0, 5, 25, 8};

        for (var numero : lista1) {
            for (var valor : lista2) {
                if (numero == valor) {
                    System.out.println("Las intersecciones son: " + numero);
                }
            }
        }
    }
}