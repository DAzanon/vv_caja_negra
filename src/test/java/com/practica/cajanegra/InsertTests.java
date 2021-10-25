package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class InsertTests {
    private SingleLinkedListImpl<String> miLista;
    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl<String>("A","B","C");
    }


    @ParameterizedTest(name="Add Last {0} in list")
    @ValueSource(strings= {"A", "M", "Z", "@","["})
    public void addLast(String s) {
        this.miLista.addLast(s);
        if((s.charAt(s.length()-1)=='@') || (s.charAt(s.length()-1)=='['))
            assertNotEquals("[A, B, C, " + s + "]", this.miLista.toString());
        else
            assertEquals("[A, B, C, " + s + "]", this.miLista.toString());
    }

}

