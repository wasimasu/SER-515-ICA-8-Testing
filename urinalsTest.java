// Auth: Wasim Ahamed Syed
import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {



    @org.junit.jupiter.api.Test
    void logicTest1(){
        assertEquals(2,urinals.countUrinals("0000"));
    }

    //testcase for goodstring
    @org.junit.jupiter.api.Test
    void invalidInput(){
        assertEquals(-1,urinals.countUrinals("aaabbb"));
    }

}