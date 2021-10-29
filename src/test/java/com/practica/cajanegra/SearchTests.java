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
    
    @ParameterizedTest(name="Add First {0} in list")
@ValueSource(strings= {"C", "B", "A"})
public void reverse(String s) {
    this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
    assertEquals(this.miLista.reverse(), s);
}
    @Test
    public void emptyTest(){
        this.miLista = new SingleLinkedListImpl<String>();
        assertEquals(true, this.miLista.isEmpty());
    }

    @Test
    public void notEmptyTest1(){
        this.miLista = new SingleLinkedListImpl<String>("A");
        assertEquals(false, this.miLista.isEmpty());
    }

    @Test
    public void notEmptyTest3(){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals(false, this.miLista.isEmpty());
    }

    @Test
    public void size0Test(){
        this.miLista = new SingleLinkedListImpl<String>();
        assertEquals(0, this.miLista.size());
    }

    @Test
    public void size1Test(){
        this.miLista = new SingleLinkedListImpl<String>("A");
        assertEquals(1, this.miLista.size());
    }

    @Test
    public void size5Test(){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals(5, this.miLista.size());
    }

    @Test
    public void isSubListTestN(SingleLinkedListImpl list){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals(2, miLista.isSubList(new SingleLinkedListImpl<>("B", "C")));
    }

    @Test
    public void isSubListTest0(SingleLinkedListImpl list){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals(0, miLista.isSubList(new SingleLinkedListImpl<>()));
    }
    @Test
    public void isSubListTest1(SingleLinkedListImpl list){
        this.miLista = new SingleLinkedListImpl<String>("A");
        assertEquals(1, miLista.isSubList(new SingleLinkedListImpl<>("A")));
    }
    @Test
    public void isNotSubListTest(SingleLinkedListImpl list){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E");
        assertEquals(-1, miLista.isSubList(new SingleLinkedListImpl<>("X", "B")));
    }
}

