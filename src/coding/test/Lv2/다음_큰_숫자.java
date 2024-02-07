package coding.test.Lv2;

public class 다음_큰_숫자 {
    public int solution(int n) {
        int answer = 0;
        String str1 = "";
        int number = n;
        int cnt1 = 0;

        while(n>0){
            str1 = n%2 + str1;
            n/=2;
        }

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == '1'){
                cnt1++;
            }
        }

        boolean bool = true;
        while (bool){
            int nn = ++number;
            int num = nn;
            int result = num;
            String str2 = "";

            while (num>0){
                str2 = num%2 + str2;
                num/=2;
            }

            int cnt2 = 0;
            for(int i=0; i<str2.length(); i++){
                if(str2.charAt(i) == '1'){
                    cnt2++;
                }
            }

            if(cnt1 == cnt2){
                answer = result;
                bool = false;
            }else {
                bool = true;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        다음_큰_숫자 aa = new 다음_큰_숫자();
        System.out.println(aa.solution(78));
    }
}
