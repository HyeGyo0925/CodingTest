package coding.test.Lv1;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long p = 0, sum=0;

        for(int i=0; i<count; i++){
            p += price ;
            sum += p;
        }

        if(money < sum){
            answer = sum - money;
        }else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        부족한_금액_계산하기 aa = new 부족한_금액_계산하기();
        System.out.println(aa.solution(3, 20, 4));
    }
}
