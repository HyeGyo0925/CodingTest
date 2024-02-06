package coding.test.Lv2;

public class JadenCase_문자열_만들기 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        for(int i=0; i<str.length; i++){
            String first = String.valueOf(str[i].charAt(0)).toUpperCase();
            String second = "";
            for(int a=1; a<str[i].length(); a++){
                String ss = String.valueOf(str[i].charAt(a));
                second += ss.toLowerCase();
            }
            answer += first+second + " ";

        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }

    public static void main(String[] args) {
        JadenCase_문자열_만들기 aa = new JadenCase_문자열_만들기();
        System.out.println(aa.solution("3people unFollowed me"));
        System.out.println(aa.solution("for the last week"));
    }
}
