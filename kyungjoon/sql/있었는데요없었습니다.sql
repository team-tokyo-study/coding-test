-- https://school.programmers.co.kr/learn/courses/30/lessons/59043

SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS /*AS*/ O
LEFT /*OUTER*/ JOIN ANIMAL_INS /*AS*/ I
ON (O.ANIMAL_ID = I.ANIMAL_ID) -- USING (ANIMAL_ID)과 동일
WHERE O.DATETIME < I.DATETIME  -- 입양일 < 보호시작일 (작을수록 더 과거의 시간 또는 빠른시간)          
ORDER BY I.DATETIME;

/*
JOIN문법 정리
https://developyo.tistory.com/121
https://syujisu.tistory.com/entry/MySQL%EC%A1%B0%EC%9D%B8JOIN
*/