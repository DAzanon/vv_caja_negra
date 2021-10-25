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
    public void removeLastInEmpty(String s){
        this.miLista = new SingleLinkedListImpl<String>();
        assertThrows(EmptyCollectionException);
    }
    */

    @Test
    public void removeLastOneElement(String s){
        this.miLista = new SingleLinkedListImpl<String>("A");
        assertEquals("[]", this.miLista.toString());
    }

    @Test
    public void removeLastFewElement(String s){
        assertEquals("[A, B]", this.miLista.toString());
    }
}
