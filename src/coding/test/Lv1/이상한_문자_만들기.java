package coding.test.Lv1;

public class 이상한_문자_만들기 {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;

        for(int i=0; i<s.length(); i++){
            String str = String.valueOf(s.charAt(i));
            
            if(str.equals(" ")){
                cnt = 0;
            } else {
                cnt++;
            }

            if(cnt % 2 == 0){
                answer += str.toLowerCase();
            }else {
                answer += str.toUpperCase();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        이상한_문자_만들기 aa = new 이상한_문자_만들기();
        System.out.println(aa.solution("try hello world"));
    }
}
