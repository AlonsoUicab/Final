import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testeo {
    
    public Testeo() {
    }
    Prueba x = new Prueba();
    
    @Test
    public void testHash1(){
        assertEquals(2, x.probar("58748"));
    }
    @Test
    public void testHash2(){
       assertEquals(1, x.probar("58780")); 
    }
    @Test
    public void testHash3(){
        assertEquals(1, x.probar("58770"));
    }
    @Test
    public void testHash4(){
        assertEquals(1, x.probar("58752"));
    }
    @Test
    public void testHash5(){
        assertEquals(1, x.probar("58807"));
    }
    @Test
    public void testHash6Mio(){
        assertEquals(1, x.probar("51695"));
    }
}
