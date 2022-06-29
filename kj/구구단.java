// https://www.acmicpc.net/problem/2739

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("단을 입력하세요");
        int N = scanner.nextInt(); // 입력한 값을 int값으로 출력시킴. 참조 https://projectht.tistory.com/24

        scanner.close();

        for(int i = 1; i <=9; i++) { // 1부터 9까지 반복
            System.out.println(N + "*" + i + "=" + (N*i)); // N단*i(1~9반복)=(N*i)
        }
        
    }
}