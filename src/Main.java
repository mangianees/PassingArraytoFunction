import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static int positiveNumberAdd(int[] arr){
        int varSum = 0;
        for(int var : arr)
        {
            if(var > 0)
                varSum += var;
        }

        return varSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {22,55,-6,55};
        System.out.println(positiveNumberAdd(arr1));
    }
}