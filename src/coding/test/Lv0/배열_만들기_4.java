package coding.test.Lv0;
// 배열 만들기 4

import java.util.ArrayList;
import java.util.List;

public class 배열_만들기_4 {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        int i=0;
        while(i<arr.length){
            if(stk.size() == 0){
                stk.add(arr[i]);
                i+=1;
            }else {
                int last = stk.get(stk.size()-1);
                if(stk.size() != 0 && last<arr[i]){
                    stk.add(arr[i]);
                    i+=1;
                } else if (stk.size() != 0 && last>=arr[i]) {
                    stk.remove(stk.size()-1);
                }
            }
        }

        return stk;
    }

    public static void main(String[] args) {
        배열_만들기_4 aa = new 배열_만들기_4();
        System.out.println(aa.solution(new int[]{1, 4, 2, 5, 3}));
    }
}
