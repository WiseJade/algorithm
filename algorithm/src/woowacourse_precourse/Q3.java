package woowacourse_precourse;

public class Q3 {
    int Solution (int number) {
        int result = 0;
        for (int i = 3; i <= number; i++) {
            String snum = String.valueOf(i);
            for (int j = 0; j < snum.length(); j++) {
                if (snum.charAt(j) == '3' || snum.charAt(j) == '6' || snum.charAt(j) == '9')
                    result++;
            }
        }
        return result;
    }
}
