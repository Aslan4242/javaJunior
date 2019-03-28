package lesson9;

public class Main2 {
    public static void main(String[] args) {
        DrobnoeChislo drob1 = new DrobnoeChislo();
        DrobnoeChislo drob2 = new DrobnoeChislo();

        drob1.setChislitel(3);
        drob1.setZnamenatel(15);
        drob2.setChislitel(4);
        drob2.setZnamenatel(18);

        int result = UtilsDroby.commonZnam(drob1,drob2);
        System.out.println(result);
    }
}
