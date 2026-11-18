public class Barista {
    private int coffeePrice;
    private int beenCount;
    private int cashBox;

    public Barista() {
        coffeePrice = 3000;
        beenCount = 10;
        cashBox = 0;
    }

    public Barista(int coffeePrice, int beenCount) {
        this.coffeePrice = coffeePrice;
        this.beenCount = beenCount;
        cashBox = 0;
    }

    public int getCoffeePrice(String menu) {
        return coffeePrice;
    }

    public String makeCoffee(String menu) {
        beenCount--;
        System.out.println("[바리스타] " + menu + "를 만들었습니다.");
        return menu;
    }

    public String takeOrder(String menu, int money) {
        System.out.println("[바리스타] " + menu + "가 주문되었습니다.");
        System.out.println("[바리스타] " + money + "원을 받았습니다.");


        if (isBean() == true) {
            System.out.println("[바리스타] 원두가 부족하여 주문이 불가능합니다.");
            return "주문 실패";
        }

        cashBox = cashBox + money;
        System.out.println("[바리스타] 금고 잔액: " + cashBox + "원");

        String madeCoffee = makeCoffee(menu);
        return madeCoffee;
    }

    public boolean isBean() {
        if(beenCount <= 0)
            return true;
        else
            return false;
    }
}