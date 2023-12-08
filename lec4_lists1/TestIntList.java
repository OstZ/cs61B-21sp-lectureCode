package lec4_lists1;

import jh61b.junit.In;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestIntList {
    @Test
    public void testIncrList(){
        IntList l0 = IntList.of(1,2,3,5,8);
        IntList l1 = IntList.of(1);
        assertEquals("2 -> 3 -> 4 -> 6 -> 9", IntList.dincrList(l0, 1).toString());
        assertEquals("2", IntList.dincrList(l1, 1).toString());
    }
}
