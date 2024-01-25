package coding.test.Lv1;

public class 수박수박수박수박수박수 {
    public String solution(int n) {
        String answer = "";
        String[] watermelon = new String[]{"수", "박"};

        if(n==1){
            return answer=watermelon[0];
        } else if (n==2) {
            return answer= "수박";
        }

        for(int i=0; i<n/2; i++){
            if(n%2==0){
                answer+="수박";
            }else {
                answer+="수박";
            }
        }

        if(n%2!=0){
            answer+="수";
        }

        return answer;
    }

    public String watermelon(int n){
        String result = "";

        for(int i=0; i<n; i++){
            result += (i%2==0)?"수":"박";
        }

        return result;
    }

    public static void main(String[] args) {
        수박수박수박수박수박수 aa = new 수박수박수박수박수박수();
        System.out.println(aa.solution(1));
        System.out.println(aa.solution(2));
        System.out.println(aa.solution(3));
        System.out.println(aa.solution(4));
        System.out.println(aa.solution(5));
        System.out.println(aa.solution(6));
        System.out.println(aa.solution(7));
        System.out.println(aa.solution(8));

        System.out.println(aa.watermelon(3));
    }
}
