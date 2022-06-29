import java.util.Scanner;

class Solution {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

   for(int i = 0; i < b ; i ++ ){ // 줄의 개수인 b만큼 반복되도록 작성해주고 반복될 때마다 하나씩 증가한다.(0,1,2에서 끝)
       for(int j = 0; j < a; j++){ //한 줄의 찍힌 별의 개수인 a만큼 반복하도록 작성해주고 반복될 때마다 하나씩 증가한다.
​(0,1,2,3,4)
System.out.print("*"); // for문이 반복되면서 이 찍히도록 System.out.print(""); 로 출력되도록 작성해 준다.
}
System.out.println(); // for문을 빠져나와 표시 위치를 다음 행의 동일 위치로 이동시키기 위해 System.out.println(); 을 작성해 준다.
}
}
}