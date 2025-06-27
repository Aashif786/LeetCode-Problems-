# Last updated: 6/27/2025, 11:42:34 AM
class Solution(object):
    def uniqueMorseRepresentations(self, words):
        code = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        l= set()
        for word in words:
            m = ""
            for c in word:
                m += code[ord(c) - ord('a')]
            l.add(m)
        return len(l)