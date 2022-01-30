class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        int length = s.length();
        int rem = length%k;
        if(length%k != 0){
            for(int i=1; i<= k-rem; i++){
            s = s + fill;
        }
        }
        
        String[] subStringList = new String[s.length()/k];
        for(int i=0, j=0; i<s.length() && j<s.length()/k ; i++, j++){
            int subIndex = i+(k-1);
            String sub = s.substring(i, subIndex+1);
            subStringList[j] = sub;
            i = subIndex;
        }
        return subStringList;
    }
}