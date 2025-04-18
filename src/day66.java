import java.util.*;
public class day66{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            int f = in.nextInt();
            int b = in.nextInt();
            int t = in.nextInt();
            int d = in.nextInt();
            int cur = 0;
            int ans = 0;

            while(cur < d){
                cur += b;
                ans+= (t*b);
                if(cur >=d) break;
                cur-= f;
                ans+=(t*f);
            }
            if(cur == d) System.out.println(ans);
            else System.out.println(ans - ((cur - d)*t));
        }
    }
}