
import org.junit.jupiter.api.Test;
import pack.LineMas;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class test {
    @Test
    void testfirs(){
        LineMas first=new LineMas();
        assertArrayEquals(new int[]{4,5},first.maxInMas(new int[]{12, 435, -20, -2000000000, 300000, 87465}));
        assertArrayEquals(new int[]{0,5},first.maxInMas(new int[]{1,2,3,4,5,6,-25,6}));

    }





}
