package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;
class Sorter {
public static List<String> takeOldestMans(List<Map<String,String>> userList) {
    Comparator<Map<String, String>> byData = Comparator.comparing(u -> LocalDate.parse(u.get("birthday")));
    return (List<String>) userList.stream()
            .filter(u -> u.get("gender").equals("male"))
            .sorted(byData)
            .map(u -> u.get("name"))
            .collect(Collectors.toList());
}
}