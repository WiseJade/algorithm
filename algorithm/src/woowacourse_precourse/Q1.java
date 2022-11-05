package woowacourse_precourse;

public class Q1 {
    int solution (int[] pobi, int[] crong) {
        if (!(pobi.length == 2) || !(crong.length == 2)) return -1;
        if (pobi[0] % 2 == 0 || !(pobi[1] == pobi[0] + 1) || crong[0] % 2 == 0 || !(crong[1] == crong[0] + 1)) return -1;
        int pobiMax = 0;
        int crongMax = 0;
        pobiMax = findMax(pobi[0]);
        crongMax = findMax(crong[0]);
        pobiMax = Math.max(pobiMax, findMax(pobi[1]));
        crongMax = Math.max(crongMax, findMax(crong[1]));
        if (pobiMax > crongMax) return 1;
        else if (pobiMax < crongMax) return 2;
        else if (pobiMax == crongMax) return 0;
        else return -1;
    }

    // 숫자를 입력받아 각자리 숫자의 합과 곱 중 더 큰 수를 반환하는 메소드
    int findMax (int num) {
        int add = 0;
        int multiple = 1;
        char[] numArr = String.valueOf(num).toCharArray();
        for (char c : numArr) {
            add += c - '0';
            multiple *= c - '0';
        }
        return Math.max(add, multiple);
    }
}
