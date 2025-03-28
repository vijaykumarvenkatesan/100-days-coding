import java.util.Scanner;

public class day59 {
    public static boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;
        while(left < right){
            if(s.charAt(left)!= s.charAt(right)) return false;
            left ++;
            right --;
        }
        return true;
    }

    public static int minCycle(String s){
        if(isPalindrome(s)) return 0;
        int n = s.length();
        for(int i=1; i<n; i++){
            String rightShift = s.substring(i) + s.substring(0,i);
            String leftShift = s.substring(n-i) + s.substring(0,n-i);
            if(isPalindrome(rightShift) || isPalindrome(leftShift)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t>0){
            String s = in.nextLine();
            System.out.println(minCycle(s));
            t--;
        }
    }
}
