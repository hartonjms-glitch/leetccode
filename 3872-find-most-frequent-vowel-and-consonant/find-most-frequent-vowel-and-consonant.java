class Solution {
    public int maxFreqSum(String s) {
    Map<Character, Integer> freq = new HashMap<>();
    Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    for (char ch : s.toCharArray()) {
        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }

    int maxVowel = 0;
    int maxConsonant = 0;

    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
        char ch = entry.getKey();
        int count = entry.getValue();
        if (vowels.contains(ch)) {
            maxVowel = Math.max(maxVowel, count);
        } else {
            maxConsonant = Math.max(maxConsonant, count);
        }
    }

    return maxVowel + maxConsonant;
}
        
    
}