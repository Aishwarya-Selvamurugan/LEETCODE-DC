class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        if(str.length != pattern.length())
        {
            return false;
        }
        Map<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char a = pattern.charAt(i);
            if(map.containsKey(a) && !map.get(a).equals(str[i]))
            {
                return false;
            }
            else if(map.containsKey(a) && map.get(a).equals(str[i]))
            {
                continue;
            }
            else if(map.containsValue(str[i]))
            {
                return false;
            }
            else 
            {
                map.put(a,str[i]);
            }
        }
        return true;
    }
}


