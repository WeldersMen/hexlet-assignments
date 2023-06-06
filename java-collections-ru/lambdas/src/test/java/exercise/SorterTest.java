package exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.util.List;

class SorterTest {
    @Test
    void testSorterWithoutMan() {
        List<Map<String, String>> users = List.of(
            Map.of("name", "Anna Sidorova", "birthday", "1996-09-09", "gender", "female"),
            Map.of("name", "Vanessa Vulf", "birthday", "1985-11-16", "gender", "female"),
            Map.of("name", "Alice Lucas", "birthday", "1986-01-01", "gender", "female"),
            Map.of("name", "Elsa Oscar", "birthday", "1970-03-10", "gender", "female")
        );
        List<String> actual = Sorter.takeOldestMans(users);
        List expected = List.of();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSorter() {
        List<Map<String, String>> users = List.of(
            Map.of("name", "Vladimir Nikolaev", "birthday", "1990-12-27", "gender", "male"),
            Map.of("name", "Andrey Petrov", "birthday", "1989-11-23", "gender", "male"),
            Map.of("name", "Anna Sidorova", "birthday", "1996-09-09", "gender", "female"),
            Map.of("name", "John Smith", "birthday", "1989-03-11", "gender", "male"),
            Map.of("name", "Vanessa Vulf", "birthday", "1985-11-16", "gender", "female"),
            Map.of("name", "Alice Lucas", "birthday", "1986-01-01", "gender", "female"),
            Map.of("name", "Elsa Oscar", "birthday", "1970-03-10", "gender", "female")
        );
        List<String> actual = Sorter.takeOldestMans(users);
        List expected = List.of("John Smith", "Andrey Petrov", "Vladimir Nikolaev");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSorterWithEmptyList() {
        List<Map<String, String>> users = List.of();
        List<String> actual = Sorter.takeOldestMans(users);
        List expected = List.of();
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void testEnlargedArrayImageSize() {
        String[][] image = {{"1", "1"}, {"1", "1"}};
        String[][] enlargedImage = App.enlargeArrayImage(image);
        Assertions.assertEquals(enlargedImage.length, 4);    // Ожидаемый размер: 4 строки
        Assertions.assertEquals(enlargedImage[0].length, 4); // Ожидаемый размер: 4 столбца
    }

    @Test
    void testEnlargedArrayImageContent() {
        String[][] image = {{"1", "2"}, {"3", "4"}};
        String[][] expectedEnlarged = {{"1", "1", "2", "2"}, {"1", "1", "2", "2"}, {"3", "3", "4", "4"}, {"3", "3", "4", "4"}};
        String[][] actualEnlarged = App.enlargeArrayImage(image);
        Assertions.assertArrayEquals(expectedEnlarged, actualEnlarged);
    }

    @Test
    void testEnlargedArrayImageEmptyInput() {
        String[][] image = {{}};
        String[][] expectedEnlarged = {{}};
        String[][] actualEnlarged = App.enlargeArrayImage(image);
        Assertions.assertArrayEquals(expectedEnlarged, actualEnlarged);
    }
}
