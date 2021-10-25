package com.practica.cajanegra;


import com.cajanegra.SingleLinkedListImpl;
import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SearchTests {
    private SingleLinkedListImpl<String> miLista;


    @Test
    public void atFirstPosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals(1, this.miLista.indexOf("A"));
    }

    @Test
    public void atMidPosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals(2, this.miLista.indexOf("B"));
    }

    @Test
    public void atLastPosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals(3, this.miLista.indexOf("C"));
    }
    /*
    @Test
    public void at0Position() {
    this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertThrows(java.util.NoSuchElementException, this.miLista.indexOf("F"));
    }
    */

}
