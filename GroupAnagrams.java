import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Grouped anagrams: " + groupAnagrams(input1));

        String[] input2 = {""};
        System.out.println("Grouped anagrams: " + groupAnagrams(input2));

        String[] input3 = {"a"};
        System.out.println("Grouped anagrams: " + groupAnagrams(input3));
    }
}
