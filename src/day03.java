import java.util.Scanner;

public class day03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        StringBuilder ans = new StringBuilder();
        while(num > 0){
            num --;
            char c = (char)('A' + (num % 26));
            ans.insert(0,c);
            num /= 26;
        }
        System.out.println(ans);
    }
}
