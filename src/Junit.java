import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Junit {
    StrStr strStr = new StrStr();

    @Test
    void hello() {
        int i = strStr.strStr("hello", "ll");
        assertEquals(i , 2);
    }

    @Test
    void falseCase() {
        int i = strStr.strStr("abc", "c");
        assertEquals(i , 2);
    }

    @Test
    void emptyString() {
        int i = strStr.strStr("", "");
        assertEquals(i, 0);
    }

    @Test
    void missisisspi() {
        int i = strStr.strStr("mississippi", "issip");
        assertEquals(i, 4);
    }


}
