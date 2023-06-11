package exercise;

import java.nio.file.Files;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
    public class App {
        public static String getForwardedVariables(String configContent) {
            return Arrays.stream(configContent.split("\n"))
                    .filter(line -> line.contains("environment="))
                    .flatMap(line -> Arrays.stream(line.substring(line.indexOf('=') + 2, line.length() - 1).split(",")))
                    .filter(variable -> variable.startsWith("X_FORWARDED_"))
                    .map(variable -> variable.substring(12))
                    .map(variable -> {
                        String[] keyValue = variable.split("=");
                        return keyValue[0] + "=" + keyValue[1];
                    })
                    .collect(Collectors.joining(","));
        }
}
//END
