package util;

import domain.DeckClass;
import domain.DeckClassPair;
import java.util.Map;

public class TestForLoop {

    private static final DeckClass[] dcArray = DeckClass.values();

    public static boolean zeroesInDcIntMap(Map<DeckClass, Integer> map, DeckClass... exceptions) {
        for (DeckClass dc : dcArray) {
            if (map.get(dc) != 0 && !objectIsAnException(dc, (Object[]) exceptions)) {
                return false;
            }
        }
        return true;
    }

    private static boolean objectIsAnException(Object o, Object... exceptions) {
        for (Object exception : exceptions) {
            if (o.equals(exception)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zeroesInDcpIntMap(Map<DeckClassPair, Integer> map, DeckClassPair... exceptions) {
        for (DeckClass dc1 : dcArray) {
            for (DeckClass dc2 : dcArray) {
                DeckClassPair dcp = new DeckClassPair(dc1, dc2);
                if (map.get(dcp) != 0 && !objectIsAnException(dcp, (Object[]) exceptions)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean zeroesInDcDoubleMap(Map<DeckClass, Double> map, DeckClass... exceptions) {
        for (DeckClass dc : dcArray) {
            if (map.get(dc) != 0 && !objectIsAnException(dc, (Object[]) exceptions)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zeroesInDcpDoubleMap(Map<DeckClassPair, Double> map, DeckClassPair... exceptions) {
        for (DeckClass dc1 : dcArray) {
            for (DeckClass dc2 : dcArray) {
                DeckClassPair dcp = new DeckClassPair(dc1, dc2);
                if (map.get(dcp) != 0 && !objectIsAnException(dcp, (Object[]) exceptions)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean zeroesInIntIntMap(Map<Integer, Integer> map, int... exceptions) {
        for (int i = 0; i <= 12; i++) {
            if (map.get(i) != 0 && !integerIsAnException(i, exceptions)) {
                return false;
            }
        }
        return true;
    }

    private static boolean integerIsAnException(int integer, int... exceptions) {
        for (Integer exception : exceptions) {
            if (integer == exception) {
                return true;
            }
        }
        return false;
    }

    public static boolean zeroesInIntDoubleMap(Map<Integer, Double> map, int... exceptions) {
        for (int i = 0; i <= 12; i++) {
            if (map.get(i) != 0 && !integerIsAnException(i, exceptions)) {
                return false;
            }
        }
        return true;
    }
}
