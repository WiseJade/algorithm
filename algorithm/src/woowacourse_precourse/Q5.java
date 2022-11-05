package woowacourse_precourse;

public class Q5 {
    public int[] Solution(int money) {
        int[] exchange = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (money >= 50000) {
            exchange[0]++;
            money -= 50000;
        }
        while (money >= 10000) {
            exchange[1]++;
            money -= 10000;
        }
        while (money >= 5000) {
            exchange[2]++;
            money -= 5000;
        }
        while (money >= 1000) {
            exchange[3]++;
            money -= 1000;
        }
        while (money >= 500) {
            exchange[4]++;
            money -= 500;
        }
        while (money >= 100) {
            exchange[5]++;
            money -= 100;
        }
        while (money >= 50) {
            exchange[6]++;
            money -= 50;
        }
        while (money >= 10) {
            exchange[7]++;
            money -= 10;
        }
        exchange[8] = money;
        return exchange;
    }
}
