public class LeetCode14 {
    //https://leetcode.com/problems/longest-common-prefix/
    public String longestCommonPrefix(String[] strs) {

        String result= strs[0];

        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(result)!=0){
                result=result.substring(0,result.length()-1);
            }
        }
        return result;
    }
    }


