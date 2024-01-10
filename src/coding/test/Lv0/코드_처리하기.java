package coding.test.Lv0;
// 코드_처리하기

public class 코드_처리하기 {
    public String solution(String code){
        String answer="";
        int mode = 0;
        for(int i=0; i<code.length(); i++){
            String s = code.substring(i, i+1);

            if(mode == 0){
                if(s.equals("1")){
                    mode = 1;
                }else{
                    if(i%2==0){
                        answer += s;
                    }
                }
            }else{
                if(s.equals("1")){
                    mode = 0;
                }else{
                    if(i%2==1){
                        answer += s;
                    }
                }
            }

        }

        if(answer.equals("")){
            answer = "EMPTY";
        }
        return answer;
    }

    public static void main(String[] args) {
        코드_처리하기 aa = new 코드_처리하기();
        System.out.println(aa.solution("abc1abc1abc"));
    }
}
