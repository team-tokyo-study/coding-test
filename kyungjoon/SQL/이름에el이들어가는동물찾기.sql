-- https://school.programmers.co.kr/learn/courses/30/lessons/59047

SELECT ANIMAL_ID, NAME FROM ANIMAL_INS
WHERE ANIMAL_TYPE = "DOG" AND NAME LIKE "%EL%" 
ORDER BY NAME;

/*
1. el로 시작하는 NAME 검색 NAME LIKE "el%" 
2. el로 끝나는 NAME 검색 NAME LIKE "%el" 
3. el가 들어가는 NAME 검색 NAME LIKE "%el%"
*/