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

    public static void main(String[] args) {
        삼진법_뒤집기 aa = new 삼진법_뒤집기();
        System.out.println(aa.solution(45));
       // System.out.println(aa.solution(125));
    }
}
