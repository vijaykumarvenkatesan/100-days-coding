import java.util.*;
public class day47 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(" ");
        String[] ans = new String[2];
        String num = in.nextLine();
        String[] word = new String[2];
        word[0] = words[num.charAt(0)-'1'];
        word[1] = words[num.charAt(1)-'1'];
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<word.length;i++){
            int n = word[i].length()%2==0 ? word[i].length()/2-1 : word[i].length()/2;
            for(int j=n; j>=0;j--){
                answer.append(word[i].charAt(j));
            }
            if(word[i].length()%2==0)answer.append(word[i].substring(n+1));
            else answer.append(word[i].substring(n));
            if(i==0) answer.append(" ");
        }
        System.out.println(answer);


    }
}
