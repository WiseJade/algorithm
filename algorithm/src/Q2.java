public class Q2 {
    String Solution(String cryptogram) {
        StringBuffer cryptBuffer = new StringBuffer(cryptogram);
        boolean isCrypt = false;
        while (true) {
            isCrypt = false;
            for (int i = 0; i < cryptBuffer.length() - 1; i++) {
                if (cryptBuffer.charAt(i) == cryptBuffer.charAt(i+1)) {
                    cryptBuffer.deleteCharAt(i);
                    cryptBuffer.deleteCharAt(i);
                    isCrypt = true;
                    i--;
                }
            }
            if (!isCrypt)   break;
        }
        return cryptBuffer.toString();
    }
}
