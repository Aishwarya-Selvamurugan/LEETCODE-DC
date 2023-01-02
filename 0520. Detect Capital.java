class Solution {
    public boolean detectCapitalUse(String word) {
        boolean cap = Character.isUpperCase(word.charAt(0));
        int countU = 0;
        int countL = 0;
        for(int i=1;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                countU++;
            }
            else
            {
                countL++;
            }
        }
        return (countL == word.length()-1) || (countU == word.length()-1 && cap);
    }
}
