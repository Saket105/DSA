package conceptAndCoding;

public class TestStatic {

    static int t1 =  20;
    int t2 = 30;

    public static void test(){
        t1 = 40;
        TestStatic obj = new TestStatic();
        obj.t2 = 60;
    }
}
