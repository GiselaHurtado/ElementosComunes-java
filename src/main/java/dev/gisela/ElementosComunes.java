package dev.gisela;

import java.util.Arrays;
import java.util.Random;

public class ElementosComunes {
    
    public static void main(String[] args) {
        System.out.println();
        int[] array1 = new int[10];
        int array2[] = new int[10];
        llenarArray(array1);
        llenarArray(array2);
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
     
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i] == array2[j]){
                    System.out.println("Elemento común: " + array1[i]);
                }
            }
        }
    }
     
    static void llenarArray(int[] pArray){
        Random r = new Random();
        for(int i=0;i<pArray.length;i++){
            pArray[i] = r.nextInt(50) + 1;
        }
    }
}

