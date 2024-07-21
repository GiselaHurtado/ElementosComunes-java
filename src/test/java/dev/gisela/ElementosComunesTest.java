package dev.gisela;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;


public class ElementosComunesTest {

    @Test
    public void testEncontrarElementosComunes() {
        int[] arreglo1 = {1, 2, 3, 4, 5, 6};
        int[] arreglo2 = {4, 5, 6, 7, 8, 9};

        Set<Integer> esperado = new HashSet<>(Arrays.asList(4, 5, 6));
        Set<Integer> resultado = ElementosComunes.encontrarElementosComunes(arreglo1, arreglo2);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testNoElementosComunes() {
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {4, 5, 6};

        Set<Integer> esperado = new HashSet<>();
        Set<Integer> resultado = ElementosComunes.encontrarElementosComunes(arreglo1, arreglo2);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testTodosElementosComunes() {
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {1, 2, 3};

        Set<Integer> esperado = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> resultado = ElementosComunes.encontrarElementosComunes(arreglo1, arreglo2);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testArreglosVacios() {
        int[] arreglo1 = {};
        int[] arreglo2 = {};

        Set<Integer> esperado = new HashSet<>();
        Set<Integer> resultado = ElementosComunes.encontrarElementosComunes(arreglo1, arreglo2);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testUnSoloElemento() {
        int[] arreglo1 = {1};
        int[] arreglo2 = {1};

        Set<Integer> esperado = new HashSet<>(Arrays.asList(1));
        Set<Integer> resultado = ElementosComunes.encontrarElementosComunes(arreglo1, arreglo2);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testDiferentesLongitudes() {
        int[] arreglo1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arreglo2 = {5, 10, 15, 20, 25};

        Set<Integer> esperado = new HashSet<>(Arrays.asList(5, 10));
        Set<Integer> resultado = ElementosComunes.encontrarElementosComunes(arreglo1, arreglo2);

        assertEquals(esperado, resultado);
    }
}
