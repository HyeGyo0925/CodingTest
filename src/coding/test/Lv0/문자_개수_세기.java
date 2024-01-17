package coding.test.Lv0;
// 문자 개수 세기

public class 문자_개수_세기 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                answer[26 + c - 'a']++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문자_개수_세기 aa = new 문자_개수_세기();
        System.out.println(aa.solution("Programmers"));
    }
}
