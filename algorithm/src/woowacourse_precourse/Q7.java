package woowacourse_precourse;

import java.util.*;

public class Q7 {
    public List<String> Solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> scoreMap = new HashMap<>();
        Set<String> userFriends = new LinkedHashSet<>();

        for (List<String> friend : friends) {
            String friend0 = friend.get(0);
            String friend1 = friend.get(1);
            // user를 제외한 friends 목록의 모든 유저 추가
            if (!scoreMap.containsKey(friend0) && !friend0.equals(user)) {
                scoreMap.put(friend0, 0);
            }
            if (!scoreMap.containsKey(friend1) && !friend1.equals(user)) {
                scoreMap.put(friend1, 0);
            }
            if (friend0.equals(user)) {
                userFriends.add(friend.get(1));
            } else if (friend1.equals(user)) {
                userFriends.add(friend.get(0));
            }
        }

        for (List<String> friend : friends) {
            String friend0 = friend.get(0);
            String friend1 = friend.get(1);
            if (friend.contains(user)) continue;
            if (userFriends.contains(friend0)) {
                if (scoreMap.containsKey(friend1)) {
                    scoreMap.put(friend1, 0);
                }
                scoreMap.replace(friend1, scoreMap.get(friend1) + 10);
            } else if (userFriends.contains(friend1)) {
                if (userFriends.contains(friend0)) {
                    if (scoreMap.containsKey(friend0)) {
                        scoreMap.put(friend1, 0);
                    }
                    scoreMap.replace(friend0, scoreMap.get(friend0) + 10);
                }
            }
        }

        for (String visitor : visitors) {
            if (!scoreMap.containsKey(visitor)) {
                scoreMap.put(visitor, 1);
            } else {
                scoreMap.replace(visitor, scoreMap.get(visitor) + 1);
            }
        }

        String[] scoreUser = scoreMap.keySet().toArray(String[]::new);
        Integer[] scoreArr = scoreMap.values().toArray(Integer[]::new);
        for (int num = 0; num < 5; num++) {
            int max = 0;
            int idx = 0;
            for (int i = 0; i < scoreArr.length; i++) {
                if (scoreArr[i] == null) continue;
                if (max < scoreArr[i]) {
                    max = scoreArr[i];
                    idx = i;
                } else if (max == scoreArr[i]) {
                    if (scoreUser[idx].compareTo(scoreUser[i]) > 0) {
                        idx = i;
                    }
                }
            }
            if (scoreArr[idx] == null) return result;
            if (scoreArr[idx] != 0 && !(userFriends.contains(scoreUser[idx]))) {
                result.add(scoreUser[idx]);
            }
            scoreArr[idx] = null;
        }
        return result;
    }
}
