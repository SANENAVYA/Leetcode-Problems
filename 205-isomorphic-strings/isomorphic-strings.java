import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
         if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map1.containsKey(t.charAt(i))){
                if(map1.get(t.charAt(i)) != s.charAt(i)) return false;
            }

            else if(map2.containsKey(s.charAt(i))){
                if(map2.get(s.charAt(i)) != t.charAt(i)) return false;
            }

            else{
                map1.put(t.charAt(i),s.charAt(i));
                map2.put(s.charAt(i),t.charAt(i));
            }

        }
        return true;
    }
}