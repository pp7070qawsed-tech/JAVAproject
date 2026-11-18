public class Customer {
    private int money;
    private boolean hasCoffee;

    public Customer() {
        this.money = 1000;
        this.hasCoffee = false;
    }

    public Customer(int money) {
        this.money = money;
        this.hasCoffee = true;
    }

    public void print() {
        System.out.println("소지금: " + money + "원");
        System.out.println("커피 소유 여부: " + hasCoffee);
    }

    public Customer(int money, boolean hasCoffee) {
        this.money = money;
        this.hasCoffee = hasCoffee;
    }

    public void pay() {
    }

    public void order(Barista barista, String menuName) {
        System.out.println("[손님] " + menuName + " 한 잔 주세요.");

        int price = barista.getCoffeePrice(menuName); // 메뉴에 따른 가격 조회
        System.out.println("가격은 " + price + "원입니다.");

        if (this.money >= price) {
            this.money -= price; // 돈 지불

            String coffee = barista.takeOrder(menuName, price);
            takeCoffee(coffee);
        } else {
            System.out.println("[손님] 돈이 부족합니다");
        }
    }

    public void takeCoffee(String coffee) {
        this.hasCoffee = true;
        System.out.println("[손님] " + coffee + "를 받았습니다.");
    }
}