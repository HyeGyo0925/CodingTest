package coding.test.Lv1;

public class 삼진법_뒤집기 {
    public int solution(int n) {
        String str = "";

        while(n>0){
            str += n%3;
            n/=3;
        }
        return  Integer.parseInt(str, 3);
    }

    public int solution1(int n){
        int answer=0;
        String str = "";

        while(n>0){
            str = n%3 + str;
            n/=3;
        }

        for(int i=0; i<str.length(); i++){
            answer += Math.pow(3, i) * (str.charAt(i) - '0');
        }

        return answer;
    }

    public static void main(String[] args) {
        삼진법_뒤집기 aa = new 삼진법_뒤집기();
        System.out.println(aa.solution(45));
        System.out.println(aa.solution1(45));
       // System.out.println(aa.solution(125));
    }
}
