-- https://school.programmers.co.kr/learn/courses/30/lessons/59044

SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS /*AS*/ I
LEFT /*OUTER*/ JOIN ANIMAL_OUTS /*AS*/ O
ON I.ANIMAL_ID = O.ANIMAL_ID -- USING (ANIMAL_ID)과 동일
WHERE O.ANIMAL_ID IS NULL
ORDER BY I.DATETIME
LIMIT 3;

/*
JOIN문법 정리
https://developyo.tistory.com/121
https://syujisu.tistory.com/entry/MySQL%EC%A1%B0%EC%9D%B8JOIN
*/