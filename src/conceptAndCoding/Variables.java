package conceptAndCoding;

public class Variables {

    //default constructor
    Variables(){

    }

    int memberVariable;
    static int staticVariable = 100;
    public void dummyMethod(){
        byte localVariable = 100;
        System.out.println(localVariable);
    }

    public int dummyMethod2(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        char var = 65;
        char var1 = 97;

        System.out.println(var1);
        System.out.println(var);

        float fl1 = .3f;
        float fl2 = .1f;
        float fl3 = fl1 - fl2;
        System.out.println(fl3);

        byte x = 10;
        int intVariable = x;
        System.out.println(intVariable);

        byte a = 127;
        byte b = 1;
        byte sum = (byte) (a+b);
        int sum1 =  a+b;
        System.out.println(sum);
    }
}
