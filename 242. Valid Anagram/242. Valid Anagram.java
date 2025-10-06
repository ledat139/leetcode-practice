import java.util.HashMap;
class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;
    HashMap<Character, Integer> store = new HashMap<>();
    for (char ch : s.toCharArray()) {
      store.put(ch, store.getOrDefault(ch, 0) + 1);
    }

    for (char ch : t.toCharArray()) {
      if (!store.containsKey(ch)) {
        return false;
      }
      store.put(ch, store.get(ch) - 1);
      if (store.get(ch) == 0) {
        store.remove(ch);
      }
    }
    return store.isEmpty();
  }
}