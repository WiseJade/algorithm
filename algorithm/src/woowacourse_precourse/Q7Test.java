package woowacourse_precourse;

import java.util.List;

public class Q7Test {
    public static void main(String[] args) {
        Q7 q7 = new Q7();
        String user = "mrko";
        List<List<String>> friends = List.of(
                List.of("donut", "andole"),
                List.of("donut", "jun"),
                List.of("donut", "mrko"),
                List.of("shakevan", "andole"),
                List.of("shakevan", "jun"),
                List.of("shakevan", "mrko")
        );
        List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");
        List<String> result = q7.Solution(user, friends, visitors);
        System.out.println(result.toString());
    }
}
