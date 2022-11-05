package woowacourse_precourse;

public class Q3 {
    int Solution (int number) {
        int result = 0;
        for (int i = 3; i <= number; i++) {
            String snum = String.valueOf(i);
            if (snum.contains("3") || snum.contains("6") || snum.contains("9"))
                result++;
        }
        return result;
    }
}
