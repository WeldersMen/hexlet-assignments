package exercise;

import java.util.ArrayList;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        letters = letters.toLowerCase(); // приводим все буквы к нижнему регистру
        word = word.toLowerCase();
        ArrayList<Character> letterList = new ArrayList<Character>(); // создаем список символов из строки набора букв
        for (int i = 0; i < letters.length(); i++) {
            letterList.add(letters.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) { // перебираем символы в слове
            char c = word.charAt(i);
            boolean found = false; // флаг, который говорит, найдена ли нужная буква
            for (int j = 0; j < letterList.size(); j++) { // перебираем символы в списке букв
                if (c == letterList.get(j)) { // если символы совпадают
                    letterList.remove(j); // удаляем его из списка
                    found = true; // устанавливаем флаг, что нужная буква найдена
                    break;
                }
            }
            if (!found) { // если буква не найдена, возвращаем false
                return false;
            }
        }
        return true; // если все буквы в слове были найдены, возвращаем true
    }
}

//END
