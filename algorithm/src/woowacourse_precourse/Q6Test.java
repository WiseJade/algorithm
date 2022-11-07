package woowacourse_precourse;


public class Q6Test {
    public static void main(String[] args) {
        Q6 q6 = new Q6();
        String user = "mrko";
        String[][] friends = {
                new String[]{"jm@email.com", "제이엠"},
                new String[]{"jason@email.com", "제이슨"},
                new String[]{"woniee@email.com", "워니"},
                new String[]{"mj@email.com", "엠제이"},
                new String[]{"nowm@email.com", "이제엠"},
        };
        System.out.println(q6.Solution(friends).toString());
    }
}
