package com.practica.cajanegra;


import com.cajanegra.SingleLinkedListImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

public class SearchTests {
    private SingleLinkedListImpl<String> miLista;

    @Test
    public void indexOfFirstPosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals(1, this.miLista.indexOf("A"));
    }

    @Test
    public void indexOfMidPosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals(2, this.miLista.indexOf("B"));
    }

    @Test
    public void indexOfLastPosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals(3, this.miLista.indexOf("C"));
    }
    /*
    @Test
    public void indexOf0Position() {
    this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertThrows(java.util.NoSuchElementException, this.miLista.indexOf("F"));
    }
    */

    /*
    @ParameterizedTest(name="Get {0} element")
    @ValueSource(ints= { 1, 2, 3})
    public void getAtPos(int p) {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        if(p == 0)
            assertThrows(java.lang.IllegalArgumentException, this.miLista.getAtPos(p));
        else if(p == 1)
            assertEquals("A", this.miLista.getAtPos(p).toString());
        else if(p == 2)
            assertEquals("B", this.miLista.getAtPos(p).toString());
        else
            assertEquals("C", this.miLista.getAtPos(p).toString());
    }
    */
}
