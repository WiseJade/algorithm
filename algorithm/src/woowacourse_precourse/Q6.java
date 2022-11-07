package woowacourse_precourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q6 {
    public List<String> Solution(String[][] forms) {
        // 순서대로 이름 조합, 이메일
        Map<String, String> map = new HashMap();
        List<String> result = new ArrayList<>(forms.length);
        for (String[] form : forms) {
            for (int i = 0; i < form[1].length() - 1; i++) {
                String nameSeq = form[1].substring(i, i + 2);
                if (map.containsKey(nameSeq)) {
                    if (!result.contains(map.get(nameSeq))) {
                        result.add(map.get(nameSeq));
                    }
                    result.add(form[0]);
                } else {
                    map.put(nameSeq, form[0]);
                }
            }
        }
        result.sort(String::compareTo);
        return result;
    }
}