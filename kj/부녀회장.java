// https://www.acmicpc.net/problem/1181

import java.util.Scanner;

public class 부녀회장 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = new int[15][15]; // 2차원 배열 apt를 선언. 15*15개의 배열이 2차원으로 생성되게 된다

		for(int i = 0; i < 15; i++) { 
			apt[i][1] = 1; // 각 층의 1호는 모두 한 명이므로 1로 채우고
			apt[0][i] = i; // 0층 1호부터 i호까지는 모두 i명이므로 i 로 채움
		}


		for(int i = 1; i < 15; i ++) { // 1층부터 14층까지 반복

			for(int j = 2; j < 15; j++) { // 2호부터 14호까지 반복
				apt[i][j] = apt[i][j - 1] + apt[i - 1][j]; // i층 j호의 인원수 = i 층의 직전 호(j-1) 와 j 호의 아래층(i-1) 인원수의 합
			}
		}
		
		int T = scan.nextInt(); // 테스트 값을 입력받음 (층수 호수를 몇 번 입력하고싶은지)
		
		for(int i = 0; i < T; i++) { // 입력받은 수 만큼 출력
			int k = scan.nextInt(); // 아파트 층수값을 입력
			int n = scan.nextInt(); // 아파트 호수값을 입력
			System.out.println(apt[k][n]); // 아파트 k층 n호 출력
		}
		scan.close(); // 스캐너 종료
	}
}


/*
참고 블로그
https://st-lab.tistory.com/78
https://engpro.tistory.com/153
https://hyunipad.tistory.com/61
 */