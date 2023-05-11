package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> criteria) {
        List<Map<String, String>> resultList = new ArrayList<>(); // создаем новый список для результата поиска
        for (Map<String, String> book : books) { // проходимся по каждой книге в списке книг
            boolean match = true; // флаг для определения соответствия текущей книги заданным критериям
            for (Map.Entry<String, String> entry : criteria.entrySet()) { // проходимся по каждому критерию в словаре критериев
                String key = entry.getKey(); // получаем ключ текущего критерия
                String value = entry.getValue(); // получаем значение текущего критерия
                if (!book.containsKey(key) || !book.get(key).equals(value)) { // если книга не содержит текущий ключ или значение не соответствует заданному
                    match = false; // выставляем флаг, что текущая книга не соответствует заданным критериям
                    break; // выходим из цикла по критериям, т.к. дальнейшая проверка бессмысленна
                }
            }
            if (match) { // если текущая книга соответствует заданным критериям
                resultList.add(book); // добавляем ее в список результатов поиска
            }
        }
        return resultList; // возвращаем список результатов поиска
    }
}
//END
