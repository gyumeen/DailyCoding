import java.util.Scanner;

public class GooGooDan {
    public static void main(String[] args) {

        Scanner gooGooScanner = new Scanner(System.in);
        int startingInteger = gooGooScanner.nextInt();
        int endingInteger = gooGooScanner.nextInt();


        if(startingInteger < 10 && endingInteger < 10) {
            for (int i = startingInteger; i < endingInteger + 1; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j) );
                }
                System.out.println();
            }
        } else System.out.println("9 이하의 수로 다시 입력해주세요.");

    }
}
