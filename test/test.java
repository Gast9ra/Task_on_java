import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class test {
    @Test
    void testfirs(){
        LineMas first=new LineMas();
        int[] tes = new int[]{12, 435, -20, -2000000000, 300000, 87465};
        int[] mas = new int[]{1,2,3,4,5,6,-25,6};
        assertEquals(new int[]{4,5},first.maxInMas(tes));
        assertEquals(new int[]{0,5},first.maxInMas(mas));
    }





}
