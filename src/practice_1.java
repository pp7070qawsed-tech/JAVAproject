String[] menuNames = {"김치찌개", "수제 돈까스", "제육볶음"};
String[] optionNames = {"계란 후라이 추가", "곱빼기", "선택 안함"};
int[] menuPrices = {8000, 9500, 9000};

final int ERROR = -9;
final String ERROR_1 = "ERROR001 : 다시 입력하세요.";

int getBaseprice(int menuChoice){
    if(menuChoice<-1||menuChoice>=menuNames.length)
        return ERROR;
    return menuPrices[menuChoice];

}

int getOptionPrice(int menuOption){
    if(menuOption<0|menuOption>=4){
        return ERROR;
    }
    return switch (menuOption) {
        case 1 -> 1000;
        case 2 -> 2000;
        case 3 -> 0;
        default -> ERROR;
    };
}

String getMenuname(int menuChhoice){
    return menuNames[menuChhoice];
}

String getOptionname(int menuOption){
    return optionNames[menuOption-1];
}

void main() {
    int menuChoice = 1; // 수제돈까스
    int menuOption = 1; // 계란후라이 추가
    int menuQuantity = 2; // 수량 : 2

    Object[][] Receipt = {
            {"주문 메뉴",0},
            {"선택 옵션",0},
            {"주문 수량",0}};

    int Bprice = getBaseprice(menuChoice);
    int Oprice = getOptionPrice(menuOption);
    Receipt[0][1] = getMenuname(menuChoice);
    Receipt[1][1] = getOptionname(menuOption);
    Receipt[2][1] = menuQuantity;

    if(getBaseprice(menuChoice) == ERROR||getOptionPrice(menuOption) == ERROR){
        System.out.println(ERROR_1);}
    else{
        int allPrice = (Bprice + Oprice)*menuQuantity;

        System.out.println("=== 😋 맛나 식당 영수증 ===");
        for(Object[] objects : Receipt) System.out.println(objects[0] + " : " + objects[1]);
        System.out.println("-------------------------");
        System.out.println("총 결제 금액 : " + allPrice + "원");
    }
}