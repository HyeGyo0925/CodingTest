package coding.test.Lv1;

public class 시저_암호 {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == ' '){
                answer += c;
                continue;
            }

            if(c >= 'a' && c<= 'z'){
                if(c + n > 'z'){
                    answer += (char)(c + n -26);
                }else {
                    answer += (char)(c+n);
                }
            } else if (c >= 'A' && c<= 'Z') {
                if(c+n > 'Z'){
                    answer += (char)( c + n -26);
                }else {
                    answer += (char)(c+n);
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        시저_암호 aa = new 시저_암호();
        System.out.println(aa.solution("AB",1));
        System.out.println(aa.solution("z",1));
        System.out.println(aa.solution("a B z",4));
    }
}
