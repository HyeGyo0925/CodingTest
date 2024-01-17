package coding.test.Lv0;
// qr code

public class qr_code {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i=0; i<code.length(); i++){
            if(i%q==r){
                answer+=code.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        qr_code aa = new qr_code();
        System.out.println(aa.solution(3,1, "qjnwezgrpirldywt"));
    }
}
