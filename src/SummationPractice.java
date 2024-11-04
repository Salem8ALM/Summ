import java.util.ArrayList;
import java.util.List;

public class SummationPractice {

    public static void main(String[] args) {
        List<Integer> toSum = new ArrayList<>();
        toSum.add(5);
        toSum.add(8);
        toSum.add(9);
        toSum.add(4);
        toSum.add(3);
        int summed = summation(toSum);

        System.out.println(summed);



    }
    public static int summation (List<Integer> summed){

        int sum = 0;
        for (int number : summed){
            sum+=number;


        }
        return sum;
    }
}
