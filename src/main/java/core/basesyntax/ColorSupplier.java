package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    private static final String[] COLORS = {
            "red",
            "purple",
            "yellow",
            "black",
            "white",
            "blue"
    };

    public static String getRandomColor() {
        return COLORS[RANDOM.nextInt(COLORS.length)];
    }
}
