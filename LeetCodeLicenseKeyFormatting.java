/* You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes.
You are also given an integer k.  We want to reformat the string s such that each group contains exactly k characters, except for the first group,
which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups,
and you should convert all lowercase letters to uppercase.  Return the reformatted license key. */

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        
        StringBuilder sb = new StringBuilder();

        for (int i = S.length() - 1, count = 0 ; i >= 0 ; --i) {
            
            char c = S.charAt(i);
            if (c == '-') continue;

            if (count == K) {
                sb.append('-');
                count = 0;
            }

            sb.append(Character.toUpperCase(c));
            ++count;
        }

        return sb.reverse().toString();
    }
}
