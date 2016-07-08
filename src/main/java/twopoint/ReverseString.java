package twopoint;

/**
 * User: wcw
 * Date: 2016.07.08
 * Time: 16:50:00
 * Desc: tag : two points ; 反转字符串
 */
public class ReverseString {

    public String reverseString(String s){
        if(s == null)
            return null;
        char[] chs = s.toCharArray();
        int maxIndex = s.length()-1;
        int startIndex = 0;
        char temp = ' ';
        while (startIndex < maxIndex){
            temp = chs[maxIndex];
            chs[maxIndex] = chs[startIndex];
            chs[startIndex] = temp;
            startIndex ++;
            maxIndex --;
        }
        return new String(chs);
    }
}
