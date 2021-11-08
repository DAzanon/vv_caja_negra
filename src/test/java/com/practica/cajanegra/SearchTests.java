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
        assertThrows(java.util.NoSuchElementException.class,()->{this.miLista.toString();});
    }


    /*
    @ParameterizedTest(name="Get {0} element")
    @ValueSource(ints= { 1, 2, 3, 4})
    public void getAtPos(int p) {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        if((p <= 0) || (p > this.miLista.size()))
            assertThrows(java.lang.IllegalArgumentException, this.miLista.getAtPos(p));
        else if(p == 1)
            assertEquals("A", this.miLista.getAtPos(p).toString());
        else if(p == 2)
            assertEquals("B", this.miLista.getAtPos(p).toString());
        else
            assertEquals("C", this.miLista.getAtPos(p).toString());
    }
    */

    @Test
    public void getAtPos0Test(){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals("A", this.miLista.getAtPos(1));
    }

    @Test
    public void getAtLastPosTest(){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals("C", this.miLista.getAtPos(3));
    }

    @Test
    public void getAtMidPosTest(){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals("B", this.miLista.getAtPos(2));
    }

    @Test
    public void getAtLeftPosTest(){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertThrows(java.lang.IllegalArgumentException.class, () -> {this.miLista.getAtPos(0);});
    }

    @Test
    public void getAtRightPosTest(){
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertThrows(java.lang.IllegalArgumentException.class, () -> {this.miLista.getAtPos(4);});
    }
    
    @ParameterizedTest(name="Add First {0} in list")    //CAMBIAR
    @ValueSource(strings= {"C", "B", "A"})
    public void reverse(String s) {
        this.miLista = new SingleLinkedListImpl<String>("A", "B", "C");
        assertEquals(this.miLista.reverse(), s);    //NO TIENE SENTIDO
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

