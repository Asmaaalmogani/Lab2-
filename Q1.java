import java.util.Arrays;
import java.util.Collections;

/*
 Write a Java method that Reverse an array using another array. */
public class Q1 {
    static void reverse (Integer array[]){
        Collections.reverse(Arrays.asList(array));
        System.out.println("Reverse Array :"+Arrays.asList(array));
    }

    public static void main(String[] args) {
        Integer [] array  = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array :"+Arrays.asList(array));
        reverse(array);
    }

}