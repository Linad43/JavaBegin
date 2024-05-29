public class Les2 {
    public Les2()
    {
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        /*if (x % 2 == 0 && y % 2 == 0) {
        System.out.println("Удачное совпадение");
        }*/
        System.out.println("x = " + x + " y = " + y);
        System.out.println((x % 2 == 0 && y % 2 == 0) ? ("Удачное совпадение") : (""));

        int day = (int) (Math.round(Math.random() * 30 + 1));
        int decada = day / 10;
        System.out.println("day = " + day);
        switch (decada) {
            case 0: {
                System.out.println("day попадает в первую декаду");
                break;
            }
            case 1: {
                System.out.println("day попадает во вторую декаду");
                break;
            }
            case 2: {
                System.out.println("day попадает в третью декаду");
                break;
            }
            default:
                System.out.println("Ошибка данных");
                break;
        }
    }

}
