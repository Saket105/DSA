package objects;

public class RunTimeCheckChild extends RunTimeCheckParent{
    public static void main(String[] args) {
        System.out.println(RunTimeCheckParent.getSum(5,9));
        System.out.println(getSum(5,6));
    }

    public static int getSum(int a, int b){
        return a+b;
    }
}
