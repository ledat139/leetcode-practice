class Solution {
  public String longestCommonPrefix(String[] strs) {
    char[] firstStr = strs[0].toCharArray();
    String res = "";
    for (int i = 0; i < firstStr.length; i++) {
      char ch = firstStr[i];
      boolean checkPre = false;
      for (int j = 1; j < strs.length; j++) {
        if (i > (strs[j].length() - 1) || strs[j].charAt(i) != ch) {
          checkPre = true;
          break;
        }
      }
      if (checkPre)
        return res;
      res = res.concat(String.valueOf(ch));
    }
    return res;
  }
}