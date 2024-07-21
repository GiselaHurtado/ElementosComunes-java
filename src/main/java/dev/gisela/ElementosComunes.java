package dev.gisela;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ElementosComunes {
    

        public static void main(String[] args) {
        
            int[] arreglo1 = {1, 2, 3, 4, 5, 6};
            int[] arreglo2 = {4, 5, 6, 7, 8, 9};

            
            System.out.println("Arreglo1: " + Arrays.toString(arreglo1));
            System.out.println("Arreglo2: " + Arrays.toString(arreglo2));

            
            System.out.print("Elementos comunes: ");
            Set<Integer> comunes = encontrarElementosComunes(arreglo1, arreglo2);
            comunes.forEach(elemento -> System.out.print(elemento + " "));
        }

        
        public static Set<Integer> encontrarElementosComunes(int[] arreglo1, int[] arreglo2) {
         
            Set<Integer> conjunto = new HashSet<>();
            for (int num : arreglo1) {
                conjunto.add(num);
            }

            
            Set<Integer> elementosComunes = new HashSet<>();
            for (int num : arreglo2) {
                if (conjunto.contains(num)) {
                    elementosComunes.add(num);
                }
            }
            return elementosComunes;
        }
    }



