// https://www.acmicpc.net/problem/2439

import java.util.Scanner; 
 
public class 별찍기 {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
        
        System.out.println("몇 줄 출력?");
		int N = scanner.nextInt(); // 입력받은 값을 int값으로 출력
    
		scanner.close();
 
		for (int i = 1; i <= N; i++) {  // 1행부터 N행까지 출력 (즉, i가 행을 의미). N을 5라고 가정
			for (int j = 1; j <= N - i; j++) {  // i가 1일때 j(공백)가 4개(5-1) 반복, i가 2일때 j는 3개(5-2)...
				System.out.print(" "); // 즉, 공백이 1행에 4개, 2행에 3개, 3행에 2개, 2행에 1개, 5행에 0개
			}
			for (int k = 1; k <= i; k++) { // i가 1일때 k(별)이 1개(4개의 공백 뒤에 별 1개), i가 2일때 k도 2개(3개의 공백 뒤에 별 2개) ...  
				System.out.print("*"); // 즉, 별이 1행에 1개, 2행에 2개 3행에 3개... 붙는데, 공백이 출력된 뒤쪽에 붙음 
			}
			System.out.println();
		}
	}
}