-- https://school.programmers.co.kr/learn/courses/30/lessons/59042

SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS AS O
LEFT /*OUTER*/JOIN ANIMAL_INS /*AS*/ I
ON O.ANIMAL_ID = I.ANIMAL_ID -- USING (ANIMAL_ID)과 동일
WHERE I.ANIMAL_ID IS NULL
ORDER BY O.ANIMAL_ID;

/*
JOIN문법 정리
https://developyo.tistory.com/121
https://syujisu.tistory.com/entry/MySQL%EC%A1%B0%EC%9D%B8JOIN
*/