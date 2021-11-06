package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RemoveTests {
    private SingleLinkedListImpl<String> miLista;

    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl<String>("A","B","C");
    }

    /*
    @Test
    public void removeLastInEmpty(){
        this.miLista = new SingleLinkedListImpl<String>();
        assertThrows(com.cajanegra.EmptyCollectionException, this.miLista.toString());
    }
    */

    @Test
    public void removeLastInSizeOne(){
        this.miLista = new SingleLinkedListImpl<String>("A");
        try {
            this.miLista.removeLast();
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
        assertEquals("[]", this.miLista.toString());
    }

    @Test
    public void removeLastInSizeN(){
        this.miLista = new SingleLinkedListImpl<String>("A","B", "C");
        try {
            this.miLista.removeLast();
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
        assertEquals("[A, B]", this.miLista.toString());
    }
}
