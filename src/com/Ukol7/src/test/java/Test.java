import static org.junit.Assert.*;

public class Test {
    @org.junit.Test
    public void testCount(){
        Main main=new Main();
        assertEquals(7,main.count(2,5));
    }
}
