package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(4,5,7,2,6,3);
//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        int result = s3.reduce(0,(c,e) -> c+e);

        //s3.forEach(n -> System.out.println(n));

        //Predicate<Integer> p = n -> n%2==0;

        //Function<Integer,Integer> fun = n -> n*2;




//        int result = nums.stream()
//                .filter(n -> n%2==0)
//                .map(n -> n*2)
//                .reduce(0, (c, e) -> c + e);
//
//        System.out.println(result);

        Stream<Integer> s4 = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted();

        s4.forEach(n -> System.out.println(n));


//        for (int i =0; i< nums.size() ; i++){
//            System.out.println(nums.get(i));
//        }

//        for(int n : nums){
//            System.out.println(n);
//        }

//        nums.forEach(n -> System.out.println(n));

//        int sum = 0;
//        for(int n : nums){
//            if(n%2 == 0){
//                n = n*2;
//                sum= sum+n;
//            }
//        }
//
//        System.out.println(sum);



    }
}
