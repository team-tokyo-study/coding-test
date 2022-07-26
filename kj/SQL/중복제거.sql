-- https://school.programmers.co.kr/learn/courses/30/lessons/59408

SELECT COUNT (DISTINCT (NAME)) FROM ANIMAL_INS 
WHERE NAME IS NOT NULL;

-- COUNT 함수는 숫자를 세고, DISTINCT 함수는 중복을 제거해줌