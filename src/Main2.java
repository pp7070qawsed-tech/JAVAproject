void main() {

    int Store = 4;
    int Month = 2;
    int SUM = 0;

    String[] StoreName = {"강남점", "홍대점", "명동점", "부산점"};

    int[][] gangnam ={
        {450,520},
        {380,410},
        {420,480},
        {310,300}
    };

    for(int i=0;i<Store;i++){
        System.out.print("|" + StoreName[i] + "|");
        for(int j=0;j<Month;j++){
            System.out.print(gangnam[i][j] + "|");
            SUM += gangnam[i][j];
        };
        System.out.println();
    };
    System.out.println("|총매출|" + SUM + "(만)원");
};