void main() {
    Barista barista = new Barista(3000, 2);

    Customer customer1 = new Customer();
    customer1.order(barista, "아메리카노");

    System.out.println("---");

    Customer customer2 = new Customer();
    customer2.order(barista, "라떼");

}