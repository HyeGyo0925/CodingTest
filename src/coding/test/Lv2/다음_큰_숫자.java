package coding.test.Lv2;

public class 다음_큰_숫자 {
    public int solution(int n) {
        int answer = 0;
        String str1 = Integer.toBinaryString(n);
        int cnt1 = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == '1') cnt1++;
        }

        for(int i=n+1; i<1000000; i++){
            String str2 = Integer.toBinaryString(i);
            int cnt2 = 0;
            for(int j=0; j<str2.length(); j++){
                if(str2.charAt(j) == '1') cnt2++;
            }

            if(cnt1 == cnt2){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        다음_큰_숫자 aa = new 다음_큰_숫자();
        System.out.println(aa.solution(78));
    }
}
