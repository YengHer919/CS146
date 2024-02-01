import java.util.HashMap;
import java.util.Map;

public class Lab2 {
    public static void main(String[] args) {
        String s = "friedii";
        String t = "firedii";
        Map<Character, Integer> anagram = new HashMap<>();
        Map<Character, Integer> anagrams = new HashMap<>();

        if (s.length() == t.length()) {
            for (char ch : s.toCharArray()) {
                anagram.put(ch, anagram.getOrDefault(ch, 0) + 1);
            }

            for (char ch : t.toCharArray()) {
                anagrams.put(ch, anagrams.getOrDefault(ch, 0) + 1);
            }

            if (anagram.equals(anagrams)) {
                System.out.println(s + " and " + t + " are anagrams.");
            } else {
                System.out.println(s + " and " + t + " are not anagrams.");
            }
        } else {
            System.out.println(s + " and " + t + " are not of equal length.");
        }
    }
}