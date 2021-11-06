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
    @ValueSource(strings= {"A","B","M","Y","Z","@","["})
    public void addLast(String s) {
        this.miLista.addLast(s);
        if((s.charAt(s.length()-1)=='@') || (s.charAt(s.length()-1)=='['))
            assertNotEquals("[A, B, C, " + s + "]", this.miLista.toString());
        else
            assertEquals("[A, B, C, " + s + "]", this.miLista.toString());
    }

    @ParameterizedTest(name="Add value {0} at Pos 2 ")
    @ValueSource(strings={"A","B","M","Y","Z","@","["})
    public void addAtPosTestString(String s){
        this.miLista.addAtPos(s, 2);
        if((s.charAt(s.length()-1)=='@') || (s.charAt(s.length()-1)=='['))
            assertNotEquals("[A, " + s + ", B, C]", this.miLista.toString());
        else
            assertEquals("[A, "+ s +", B, C]", this.miLista.toString());
    }

    /*
    @ParameterizedTest(name="Add value M at Pos {0}")
    @ValueSource(ints={0, 1, 2, 3})
    public void addAtPosTestPosition(int p) {
        if(p <= 0)
            assertThrows(java.lang.IllegalArgumentException);
        else if(p == 1) {
            this.miLista.addAtPos("M", p);
            assertEquals("[M, A, B, C]", this.miLista.toString());
        }
        else if(p == 2) {
            this.miLista.addAtPos("M", p);
            assertEquals("[A, M, B, C]", this.miLista.toString());
        }
        else {
            this.miLista.addAtPos("M", p);
            assertEquals("[A, B, M, C]", this.miLista.toString());
        }
    }
    */
    
    @ParameterizedTest(name="Add First {0} in list")
    @ValueSource(strings= {"A","B","M","Y","Z","@","["})
    public void addFirst(String s) {
        this.miLista.addFirst(s);
        if((s.charAt(s.length()-1)=='@') || (s.charAt(s.length()-1)=='['))
            assertNotEquals("[" + s + ", A, B, C]", this.miLista.toString());
        else
            assertEquals("[" + s + ", A, B, C]", this.miLista.toString());
    }

    @ParameterizedTest(name="Add value {0} N times to list")
    @ValueSource(strings={"@", "A", "M", "Z", "["})
    public void addNTimesTest(String s){
        int ej = 5;//5 por ejemplo, cambiar si es necesario
        this.miLista.addNTimes(s,ej);
        //Creamos un string para comprobar si se añade bien o mal
        String str = "";
        for (int i = 0; i < ej; i++){
            str += ", "+s;
        }
        //Hacemos las comprobaciones
        if(s.equals("@") || s.equals("[")){
            assertNotEquals("[A, B, C"+str+"]", this.miLista.toString());
        }else{
            assertEquals("[A, B, C"+str+"]", this.miLista.toString());
        }
    }

    @ParameterizedTest(name="Add value {0} N times to list 2")
    @ValueSource(ints={0, 1, 10, 1000})
    public void addNTimesTest2(int n){
        String ej = "M";//M por ejemplo, cambiar si es necesario
        this.miLista.addNTimes(ej,n);
        //Creamos un string para comprobar si se añade bien o mal
        String str = "";
        for (int i = 0; i < n; i++){
            str += ", "+ej;
        }
        //Hacemos las comprobaciones
        assertEquals("[A, B, C"+str+"]", this.miLista.toString());
    }


}

