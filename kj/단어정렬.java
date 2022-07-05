// https://www.acmicpc.net/problem/1181

import java.io.BufferedReader;     // Scanner와 BufferedReader차이, BufferedReader 사용법 : https://velog.io/@icebear324/Java-%EC%9E%90%EB%B0%94-%EA%B8%B0%EC%B4%88-%EA%B8%B0%EB%B3%B8-%EC%9E%85%EC%B6%9C%EB%A0%A5
import java.io.IOException;        // BufferedReader나 BufferedWriter를 사용할 때는 IO 예외처리를 해줘야 함 
import java.io.InputStreamReader;  // BufferedReader를 사용할 때는 IOException, InputStreamReader도 같이 호출해야 함
import java.util.Arrays;           // 배열을 다루기 위해 호출. 객체를 생성하지 않고 바로 사용할 수 있음
import java.util.Comparator;       // 객체를 오름차순 이외의 기준으로 정렬. 오름차순 정렬은 Comparable 사용 (https://makemethink.tistory.com/179)

public class 단어정렬 {
	
	public static void main(String args[]) throws IOException{  // 메서드 설계 시 예외 처리를 직접 하지 않는 경우에 사용함. 메서드 이름 뒤에 throws Exception을 추가하면, 메서드에서 예외가 발생했을 때 메서드를 호출한 곳으로 exception이 던져짐 (https://mimah.tistory.com/entry/Java-예외-처리-throws와-예외-클래스-생성)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // InputStreamReader를 이용해서 문자를 인식하게 해 준 후 BufferedReader를 이용하여 문자열을 인식할 수 있게 해줌 

            int num = Integer.parseInt(br.readLine()); // 문자열을 정수로 인식시킴

            String[] arr = new String[num];

            for(int i =  0 ; i < num ; i++) { // 위에서 입력받은 수 만큼 반복 
                arr[i] = br.readLine(); // 배열에 i개 만큼의 문자열을 넣어줌
            }

            Arrays.sort(arr, new Comparator<String>() { // Array.sort(arr, new Comparator <>) 가 기본값으로, 정수정렬시에는 Array.sort(arr)만 써도 Comparator은 default값으로 적용되어 실행되므로 생략가능하나, 문자열을 정렬하기 위해서는 재정의가 필요
                @Override // 기존에 있는 메소드를 재정의할때 메소드 이름을 틀리지 않게 쓰기 위한 어노테이션 (https://www.inflearn.com/questions/22110)
                public int compare(String s1, String s2) {  // 위의 Comparator에 담길 메소드 compare를 오버라이딩. 여기선 두 개의 배열에 담긴 문자열을 비교. compare(s1, s2) 에서 -1을리턴하면 오름차순, 0을 리턴하면 동일값, 1을 리턴하면 내림차순 
                if(s1.length() == s2.length()) { // 문자열의 길이가 동일하면
                    return s1.compareTo(s2); //알파벳 오름차순으로 정렬. compareTo는 Comparator의 내부메소드로, 문자열을 사전 순으로 정렬시킴. 
                }else { // 문자열 길이가 다르면
                    return s1.length() - s2.length(); // 길이의 오름차순으로 정렬
                } // 참고 https://www.inflearn.com/questions/161396

            }
            });

            System.out.println(arr[0]); // 가장 앞의 문자열은 출력
            for(int i = 1; i < num; i++) { // 그 후의 문자열을 전부 비교해서 
            if (!arr[i].equals(arr[i - 1])) { // 앞의 문자열과 같지 않다면
				System.out.println(arr[i]); // 출력. (즉, 이전에 나온 문자열과 동일할 경우 출력하지 않음)
			}
		}
	}
}

/* 
참고 블로그
https://infodon.tistory.com/51
https://velog.io/@keithekey/%EB%B0%B1%EC%A4%80-1181%EB%B2%88-%EB%8B%A8%EC%96%B4-%EC%A0%95%EB%A0%AC
https://www.inflearn.com/questions/161396
 */