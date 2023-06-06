package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        return Arrays.stream(image)
            .flatMap(row -> Arrays.stream(new String[][]{row, row}))
            .map(row -> Arrays.stream(row)
                .flatMap(pixel -> Arrays.stream(new String[]{pixel, pixel}))
                .toArray(String[]::new)
                    )
            .toArray(String[][]::new);
    }
}
// END
