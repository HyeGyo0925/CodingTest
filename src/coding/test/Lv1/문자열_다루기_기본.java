package coding.test.Lv1;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
                String c = String.valueOf(s.charAt(i));
                if(c.matches("[a-zA-Z]+")){
                    return answer = false;
                }
            }
        }else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        문자열_다루기_기본 aa = new 문자열_다루기_기본();
        System.out.println(aa.solution("a234"));
        System.out.println(aa.solution("1234"));
        System.out.println(aa.solution("afvd"));
    }
}
