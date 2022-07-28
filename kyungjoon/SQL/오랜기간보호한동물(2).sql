-- https://school.programmers.co.kr/learn/courses/30/lessons/59411

SELECT I.ANIMAL_ID, I.NAME 
FROM ANIMAL_INS /*AS*/ I -- 첫번째 테이블(ANIMAL_INS). 
/*INNER*/ JOIN ANIMAL_OUTS /*AS*/ O -- 두번째 테이블(ANIMAL_OUTS). 두 테이블의 중복된 값을 출력
ON I.ANIMAL_ID = O.ANIMAL_ID -- 조건. 첫번째 테이블의 ID와 두번째 테이블의 ID가 일치하는 값만 출력. USING (ANIMAL_ID)로 써도 됨
ORDER BY TIMESTAMPDIFF(DAY, I.DATETIME, O.DATETIME) DESC
LIMIT 2; -- 두 항목만 출력

/*
JOIN문법 정리
https://developyo.tistory.com/121
https://syujisu.tistory.com/entry/MySQL%EC%A1%B0%EC%9D%B8JOIN
*/

/*
TIMESTAMPDIFF(단위, 날짜1, 날짜2) : 단위를 기준으로 두 날짜간의 차이를 구함
    단위값 : SECOND, MINUTE, HOUR, DAY, WEEK, MONTH, YEAR 등
*/

