package exercise0007;

/**
 * @ClassName Solution
 * @Description 7. 整数反转
 * @Author oldghoast
 * @date 9/27/21 3:39 PM
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(100));
    }

    public int reverse(int x) {
        String s = Integer.toString(x);
        char[] chars = s.toCharArray();
        char[] chars2 = new char[chars.length];
        for (int i=chars.length-1;i>0;i--){
            int j=0;
            chars2[j] = chars[i];
            j++;
        }
        String m = chars2.toString();
        return Integer.parseInt(m);
    }
}
