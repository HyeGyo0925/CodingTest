package coding.test.Lv1;

public class 하샤드_수 {
    public boolean solution(int x) {
        boolean answer = true;
        String s = Integer.toString(x);
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        if(x % sum == 0){
            answer = true;
        }else answer = false;

        return answer;
    }

    public static void main(String[] args) {
        하샤드_수 aa = new 하샤드_수();
        System.out.println(aa.solution(10));
        System.out.println(aa.solution(11));
        System.out.println(aa.solution(12));
    }
}
