String[] screenTypes = {"일반 2D", "3D 입체", "IMAX", "4DX"};
int[] basePrices = {14000, 16000, 22000, 20000};
int ERROR = -9;

int getBasePrice(String selectedScreen) {
    for(int i=0;i<screenTypes.length;i++){
        if(screenTypes[i] == selectedScreen)
            return basePrices[i];
    }
    return 0;
}

int getTimeOptionPrice(int timeCode) {
    return switch (timeCode){
        case 1 -> -3000;
        case 2 -> +2000;
        case 3 -> -2000;
        case 4 -> 0;
        default -> 0;
    };
}


String getTimeOptionName(int timeCode) {
    return switch (timeCode){
        case 1 -> "조조 할인";
        case 2 -> "프라임 타임";
        case 3 -> "심야 할인";
        case 4 -> "일반";
        default -> "오류";
    };
}

void main() {
    String selectedScreen = "IMAX";
    int timeCode = 1; // 조조 할인
    int count = 2;    // 2매

    int basePrice = getBasePrice(selectedScreen);
    int optionPrice = getTimeOptionPrice(timeCode);
    String timeOption = getTimeOptionName(timeCode);

    System.out.println("=== 🎬 CG-BOX 예매 확인증 ===");
    System.out.println("상영 종류 : " + selectedScreen);
    System.out.println("관람 시간 : " + timeOption);
    System.out.println("예매 매수 : " + count);
    System.out.println("-------------------------");
    System.out.println("총 결제 금액 : " + (basePrice + optionPrice)*count);
    System.out.println("=========================");


}