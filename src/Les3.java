public class Les3 {
    public Les3() {
        int a = 1;
        while (a <= 50) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
            a++;
        }
        a = 0;
        for (int i = 0; i <= 100; i++, a += i);
        System.out.println("сумма чисел от 1 до 100: " + a);

    }
}
