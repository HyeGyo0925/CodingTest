package coding.test.Lv1;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0){
            answer+= s.substring((s.length()/2)-1, s.length()/2+1);
        }else {
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }

    public static void main(String[] args) {
        가운데_글자_가져오기 aa = new 가운데_글자_가져오기();
        System.out.println(aa.solution("abcde"));
        System.out.println(aa.solution("qwer"));
    }
}
