String[] menuName = {"아메리카노", "카페라떼", "바닐라라떼"};
int[] menuPrice = {3000, 4000, 5000};

final int ERROR = -9;
final String ERROR_1 = "ERROR001 : 다시 입력하세요.";
final String ERROR_2 = "ERROR002 : 잘못된 사이즈를 입력하셨습니다.";

int getSize(int size){
    if(size<0|size>=4){
        return ERROR;
    }
    switch (size){
        case 1: return 0;
        case 2: return 500;
        case 3: return 1000;
        default: return ERROR;
    }

}

int getPrice(int menu){
    if(menu<-1||menu>=menuPrice.length)
        return ERROR;

    return menuPrice[menu];
}

void main(){
    int menuChoice = 1;// 카페라떼
    int menuSize = 1; // 1 : 톨 | 2 : 그란데 | 3 : 벤티

    int menuPrice = getPrice(menuChoice);
    int sizePrice = getSize(menuSize);

    if(menuPrice==ERROR){
        System.out.println(ERROR_1);
        return;
    }
    if(menuSize==ERROR){
        System.out.println(ERROR_2);
        return;
    }

    System.out.println(menuPrice);
    System.out.println(sizePrice);
}