package coding.test.Lv2;

public class 이진_변환_반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;            // 카운트
        int n = 0;
        while(s.length()>1){
            int num = 0;        // 0 삭제 개수
            int len = 0;        // 0 제거 후 길이
            String str = "";    // 이진 변환 결과

            // 0의 개수
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    num++;
                }
            }

            // 0 제거 후 길이
            len = s.length() - num;

            // 이진 변환 결과
            while(len>0){
                str = len%2 + str;
                len/=2;
            }
            s = str;
            cnt++;
            n += num;
        }

        answer[0] = cnt;
        answer[1] = n;

        return answer;
    }

    public static void main(String[] args) {
        이진_변환_반복하기 aa = new 이진_변환_반복하기();
        System.out.println(aa.solution("110010101001"));
        System.out.println(aa.solution("01110"));
        System.out.println(aa.solution("1111111"));
    }
}
