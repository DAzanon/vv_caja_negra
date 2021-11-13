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
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "Z");
        assertEquals(1, this.miLista.indexOf("A"));
    }

    @Test
    public void indexOfFirstPlusOnePosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "Z");
        assertEquals(1, this.miLista.indexOf("B"));
    }

    @Test
    public void indexOfMidPosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "Z");
        assertEquals(1, this.miLista.indexOf("M"));
    }
    @Test
    public void indexOfLastMinusOnePosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "Z");
        assertEquals(1, this.miLista.indexOf("Y"));
    }
    @Test
    public void indexOfLastPosition() {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "Z");
        assertEquals(1, this.miLista.indexOf("Z"));
    }

    @Test
    public void indexOf0Position() {
    this.miLista = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "Z");
        assertThrows(java.util.NoSuchElementException.class,()->{this.miLista.indexOf("F");});
    }

    @ParameterizedTest(name="Get {0} element")
    @ValueSource(ints= {0, 1, 2, 3, 4, 5, 6})
    public void getAtPosTest(int p) {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "M", "Y", "Z");
        if((p <= 0) || (p > this.miLista.size()))
            assertThrows(java.lang.IllegalArgumentException.class, ()->{this.miLista.getAtPos(p);});
        else if(p == 1)
            assertEquals("A", this.miLista.getAtPos(p).toString());
        else if(p == 2)
            assertEquals("B", this.miLista.getAtPos(p).toString());
        else if(p == 3)
            assertEquals("M", this.miLista.getAtPos(p).toString());
        else if(p == 4)
            assertEquals("Y", this.miLista.getAtPos(p).toString());
        else
            assertEquals("Z", this.miLista.getAtPos(p).toString());

    }
    
    @Test
    public void reverseEmpty() {
        this.miLista = new SingleLinkedListImpl<String>("");
        assertEquals(this.miLista.reverse().toString(), "[]");
    }

    @Test
    public void reverseOnly() {
        this.miLista = new SingleLinkedListImpl<String>("[A]");
        assertEquals(this.miLista.reverse().toString(), "[A]");
    }

    @Test
    public void reverseSeveral() {
        this.miLista = new SingleLinkedListImpl<String>("[A]", "[B]", "[C]");
        assertEquals(this.miLista.reverse().toString(), "[C ,B, A]");
    }



    @Test
    public void emptyTest(){
        this.miLista = new SingleLinkedListImpl<String>();
        assertTrue( this.miLista.isEmpty());
    }

    @Test
    public void EmptyTest1(){
        this.miLista = new SingleLinkedListImpl<String>("A");
        assertFalse(this.miLista.isEmpty());
    }

    @Test
    public void EmptyTest3(){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertFalse(this.miLista.isEmpty());
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

