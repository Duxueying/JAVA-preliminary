import java.util.*;

public class ZuXian{
    public int getLCA(int a, int b) {
        if (a == b) {
            return a;
        }
        while (a >= 1 && b >= 1) {
            if (a == b) {
                return a;
            }
            if (a > b) {
                a = a / 2;
                continue;
            }
            if (a < b) {
                b = b / 2;
                continue;
            }
        }
        return 1;
    }

}
