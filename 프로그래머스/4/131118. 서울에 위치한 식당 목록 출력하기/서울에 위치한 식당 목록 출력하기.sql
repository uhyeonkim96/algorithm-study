-- 코드를 입력하세요
SELECT RI.REST_ID, 
       RI.REST_NAME, 
       RI.FOOD_TYPE, 
       RI.FAVORITES, 
       RI.ADDRESS,
       (SELECT ROUND(AVG(RR.REVIEW_SCORE), 2) 
        FROM REST_REVIEW RR
        WHERE RI.REST_ID = RR.REST_ID
       ) AS SCORE
FROM REST_INFO RI
WHERE RI.ADDRESS LIKE '서울%'
AND  (SELECT ROUND(AVG(RR.REVIEW_SCORE), 2) 
        FROM REST_REVIEW RR
        WHERE RI.REST_ID = RR.REST_ID
       )  IS NOT NULL
ORDER BY SCORE DESC, 
         RI.FAVORITES DESC;