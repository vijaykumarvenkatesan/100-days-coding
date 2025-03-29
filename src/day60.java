import java.util.HashMap;
import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- >0){
            HashMap<Character,Integer> map = new HashMap<>();
            String s = in.nextLine();
            // System.out.println(s);
            for(char c : s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            boolean flag = true;
            for(char c : map.keySet()){
                if(map.get(c) != c - '`') {
                    flag = false;
                    System.out.println("No");
                    break;
                }
            }
            if(flag) System.out.println("Yes");
        }
    }
}
