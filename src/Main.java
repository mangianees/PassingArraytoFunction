public class Main {
    public static void main(String[] args) {
        int[] value = {2,4,-3,9};
        int varSum = 0;
        for(int var : value)
        {
            if(var > 0)
                varSum += var;
        }

        System.out.println(varSum);

    }
}