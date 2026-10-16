package za.ac.sun.cs.four;

import za.ac.sun.cs.three.Rounding;

/** Applies range bounds using library-three's clamp — never touches round(). */
public final class Bounds {

    private Bounds() {}

    public static double limit(double value) {
        return Rounding.clamp(value, 0.0, 100.0);
    }
}
