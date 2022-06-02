public class Main {

    public static void main(String[] args) {
        int price = 23_000;

        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(price);
        System.out.println("Бонусные милли: " + miles);
    }
}