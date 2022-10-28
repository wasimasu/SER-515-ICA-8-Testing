// Auth: Wasim Ahamed Syed
import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {


   //count urinals
    @org.junit.jupiter.api.Test
    void logicTest1(){
        assertEquals(2,urinals.countUrinals("0000"));
    }

    //testcase for goodstring
    @org.junit.jupiter.api.Test
    void invalidInput(){
        assertEquals(-1,urinals.countUrinals("aaabbb"));
    }

    //read file testcases
    @org.junit.jupiter.api.Test
    void fileFound() {
        urinals testcase = new urinals();
        assertEquals("File found and processed properly", testcase.readFile("urinals.dat"));
    }

    @org.junit.jupiter.api.Test
    void fileEmpty() {
        urinals testcase = new urinals();
        assertEquals("File is empty, please enter a valid file", testcase.readFile("emptyUrinals.dat"));

    }

    //write file testcase
    void outputfiletest(){
        urinals testcase = new urinals();
       assertEquals("I/O Exception!",testcase.writeToFile(1,"urinals22.dat"));
    }
}