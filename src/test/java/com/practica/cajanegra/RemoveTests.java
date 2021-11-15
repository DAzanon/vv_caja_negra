package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
import com.cajanegra.EmptyCollectionException;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveTests {
    private SingleLinkedListImpl<String> miLista;

    @BeforeEach
    public void setUp() {
        this.miLista = new SingleLinkedListImpl<String>("A","B","C");
    }


    @Test
    public void removeLastInEmpty(){
        this.miLista = new SingleLinkedListImpl<String>();
        assertThrows(com.cajanegra.EmptyCollectionException.class,()->{this.miLista.removeLast();});
    }


    @Test
    public void removeLastInSizeOne() throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl<String>("A");
        this.miLista.removeLast();
        assertEquals("[]", this.miLista.toString());
    }

    @Test
    public void removeLastInSizeN() throws EmptyCollectionException {
        this.miLista = new SingleLinkedListImpl<String>("A","B", "C");
            this.miLista.removeLast();
        assertEquals("[A, B]", this.miLista.toString());
    }

    @ParameterizedTest(name="Remove last element <T> from emptyList")
    @ValueSource(strings={"A","B","M","Y","Z","@","["})
    public void removeEmpty(String s){

        this.miLista = new SingleLinkedListImpl<>();

        try{
            this.miLista.removeLast();
            //Hacemos las comprobaciones
            if(s.equals("@") || s.equals("[")){
                assertNotEquals("[]", this.miLista.toString());
            }else{
                assertEquals("[]", this.miLista.toString());
            }
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }
    }

    @ParameterizedTest(name="Remove last element <T> from list with one element")
    @ValueSource(strings={"A","B","M","Y","Z","@","["})
    public void removeOneElement(String s){

        this.miLista = new SingleLinkedListImpl<>(s);

        try{
            this.miLista.removeLast();

            //Hacemos las comprobaciones
            if(s.equals("@") || s.equals("[")){
                assertNotEquals("[]", this.miLista.toString());
            }else{
                assertEquals("[]", this.miLista.toString());
            }
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }


    }

    @ParameterizedTest(name="Remove last element <T> from list with one element")
    @ValueSource(strings={"A","B","M","Y","Z","@","["})
    public void removeFewElement(String s){

        this.miLista = new SingleLinkedListImpl<>("A","B","C",s);

        try{
            this.miLista.removeLast();
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }

        //Hacemos las comprobaciones
        if(s.equals("@") || s.equals("[")){
            assertNotEquals("[A, B, C]", this.miLista.toString());
        }else{
            assertEquals("[A, B, C]", this.miLista.toString());
        }
    }
}
