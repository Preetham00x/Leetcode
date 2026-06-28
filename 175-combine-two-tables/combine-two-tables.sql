# Write your MySQL query statement below
SELECT firstName,lastName,city,state from Person P left JOIN ADDRESS A ON P.PERSONID=A.PERSONID;