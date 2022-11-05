package woowacourse_precourse;

import java.util.HashMap;
import java.util.Map;

public class Q4 {
    Map<Character, Character> map = new HashMap<>();

    public Q4() {
        map.put(' ', ' ');
        for (int i = 0; i < 26; i++) {
            map.put((char) (i + 'a'), (char) ('z' - i));
            map.put((char) (i + 'A'), (char) ('Z' - i));
        }
    }

    public String Solution(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += map.get(word.charAt(i));
        }
        return result;
    }
}
