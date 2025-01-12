# Title: Find Words Containing Character
# Submission ID: 1506193874
# Status: Accepted
# Date: January 12, 2025 at 06:39:23 PM GMT+5:30

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) res.add(i);
        }
        return res;
    }
}

        