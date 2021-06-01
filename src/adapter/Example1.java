package adapter;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String args[]){
        Integer[] arrayOfInts = new Integer[]{1,2,3,4};
        List<Integer> list = Arrays.asList(arrayOfInts);
        System.out.println("After Adapter pattern");
        System.out.println(list);
        System.out.println("Before Adapter");
        System.out.println(arrayOfInts);
    }
}
