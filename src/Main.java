import javax.swing.*;

void main() {
    Scanner sr = new Scanner(System.in);

    int STUD_NUM = 2;
    int[] num = new int[STUD_NUM];
    int[] score = new int[STUD_NUM];
    int sum = 0;

    for(int i=0; i<STUD_NUM; i++)
        num[i] = i+1;

    for(int i = 0;i<STUD_NUM;i++) {
        System.out.print(num[i]+"의 점수를 입력하세요 : ");
        score[i] = sr.nextInt();
    }

    for(int i = 0;i<STUD_NUM;i++)
        sum += score[i];

    for(int i=0; i<STUD_NUM; i++)
        System.out.println(num[i] + "|자바 점수 : " + score[i]);

    System.out.println("총점 : "+ sum);
    sr.close();
}