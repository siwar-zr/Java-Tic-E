package CollectionApi;

import java.util.*;

public class Demo {

    public static void main(String[] args){

        Set<Integer> nums = new TreeSet<>();
        nums.add(36);
        nums.add(15);
        nums.add(58);
        nums.add(92);
        //nums.add(6);

        //nums.add("5");

        //System.out.println(nums.indexOf(2));

        //System.out.println(nums.get(2));

        System.out.println(nums);

        for(int n : nums){
            System.out.println(n);
        }
    }
}
