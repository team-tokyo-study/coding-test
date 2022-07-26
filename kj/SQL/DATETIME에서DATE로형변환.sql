-- https://school.programmers.co.kr/learn/courses/30/lessons/59414

SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d') AS "날짜" 
FROM ANIMAL_INS ORDER BY ANIMAL_ID;

/*
DATE_FORMAT(날짜, 형식)
날짜를 지정한 형식으로 출력
%Y: 4자리 년도(1996)
%y: 2자리 년도(96)
%m: 숫자 월(두자리, 02)
%M: 긴 월(영문, Febuary)
%b: 짧은 월(영문, Feb)
%d: 일자(두자리, 21, 1일이면 01)
%e: 일자(한자리는 한자리, 1일이면 1)
*/