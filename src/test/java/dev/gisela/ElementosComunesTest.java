package dev.gisela;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ElementosComunesTest {
    @Test
    void testLlenarArray() {
         int[] array = new int[10];
        ElementosComunes.llenarArray(array);
        assertEquals(10, array.length);

        // Verificar que todos los elementos estén dentro del rango esperado (1 a 50)
        for (int i : array) {
            assertTrue(i >= 1 && i <= 50);
        }
    }
    

}
