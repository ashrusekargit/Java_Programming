public class Solution {
    public String reverseWords(String s) {
        String[] array=s.split(" ");
        int n=array.length;
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(array[i]+" ");
        }
        
    }
}
