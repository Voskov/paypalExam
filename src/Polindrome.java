
public class Polindrome {
    public static int solution(String str){
        int ans = 0;
        long key = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int charVal = (int) c - 96;
            long power = (long)(Math.pow(2, charVal));
            long flag = ((key%(power*2))/power);
            if (flag == 0){
                key += power;
            } else {
                key -= power;
            }

        }

        if (key == 0) return 1;
        else {
            while (key > 0){
                ans += (key % 2);
                key = key / 2;
            }
        }

        if (ans > 1){
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("a"));
        System.out.println(solution("aa"));
        System.out.println(solution("aaa"));
        System.out.println(solution("abcba"));
        System.out.println(solution("kayak"));

    }
}
