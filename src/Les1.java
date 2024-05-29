public class Les1 {
    public Les1()
    {
        int d = (int) (Math.random() * 200 - 100);
        double b = Math.random() * 200 - 100;
        char c = (char) d;
        double result = d + b + c;
        System.out.println("result = " + result);

        double a = 15;
        b = 12;
        boolean check = (a == b);
        System.out.println("check = " + check);

        a = 6;
        a += 6;
        a -= 2;
        a /= 5;
        a *= 7;
        System.out.println("a = " + a);
    }
}
