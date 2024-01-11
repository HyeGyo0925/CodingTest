package coding.test.Lv0;
// 수 조작하기 1

public class 수_조작하기_1 {
    public int solution(int n, String control){
        int answer = 0;
        for(int i=0; i<control.length(); i++){
            char c = control.charAt(i);
            if(c == 'w'){
                n += 1;
            } else if (c == 's') {
                n -=1;
            } else if (c == 'd') {
                n += 10;
            } else if (c=='a') {
                n-=10;
            }
        }

        return answer=n;
    }

    public static void main(String[] args) {
        수_조작하기_1 aa = new 수_조작하기_1();
        System.out.println(aa.solution(0, "wsdawsdassw"));
    }
}
