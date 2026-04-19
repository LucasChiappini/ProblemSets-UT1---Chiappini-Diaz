package com.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.problems.conjuntos.ejercicio24.Conjunto;
import com.problems.conjuntos.ejercicio24.TAlumno;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    void testUnion() {
        Conjunto<TAlumno> cursoAED1 = new Conjunto<>();
        Conjunto<TAlumno> cursoPF = new Conjunto<>();

        TAlumno nico = new TAlumno("0001", "Nicolas", "Perez");
        TAlumno lucas = new TAlumno("0002", "Lucas", "Chiappini");
        TAlumno ana = new TAlumno("0003", "Ana", "Lopez");
        TAlumno carla = new TAlumno("0004", "Carla", "Martinez");

        cursoAED1.insertar(nico);
        cursoAED1.insertar(lucas);
        cursoAED1.insertar(ana);

        cursoPF.insertar(lucas);
        cursoPF.insertar(ana);
        cursoPF.insertar(carla);

        Conjunto<TAlumno> union = cursoAED1.union(cursoPF);

        assertTrue(union.getElementos().contains(nico));
        assertTrue(union.getElementos().contains(lucas));
        assertTrue(union.getElementos().contains(ana));
        assertTrue(union.getElementos().contains(carla));
        assertEquals(4, union.getElementos().size());
    }

    @Test
    void testInterseccion() {
        Conjunto<TAlumno> cursoAED1 = new Conjunto<>();
        Conjunto<TAlumno> cursoPF = new Conjunto<>();

        TAlumno nico = new TAlumno("0001", "Nicolas", "Perez");
        TAlumno lucas = new TAlumno("0002", "Lucas", "Chiappini");
        TAlumno ana = new TAlumno("0003", "Ana", "Lopez");
        TAlumno carla = new TAlumno("0004", "Carla", "Martinez");

        cursoAED1.insertar(nico);
        cursoAED1.insertar(lucas);
        cursoAED1.insertar(ana);

        cursoPF.insertar(lucas);
        cursoPF.insertar(ana);
        cursoPF.insertar(carla);

        Conjunto<TAlumno> interseccion = cursoAED1.interseccion(cursoPF);

        assertTrue(interseccion.getElementos().contains(lucas));
        assertTrue(interseccion.getElementos().contains(ana));
        assertFalse(interseccion.getElementos().contains(nico));
        assertFalse(interseccion.getElementos().contains(carla));
        assertEquals(2, interseccion.getElementos().size());
    }
}
