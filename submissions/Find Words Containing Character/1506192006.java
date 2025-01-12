# Title: Find Words Containing Character
# Submission ID: 1506192006
# Status: Compile Error
# Date: January 12, 2025 at 06:37:08 PM GMT+5:30

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) idx.add(i);
        }
        return result;
    }
}

        