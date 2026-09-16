# Write your MySQL query statement below
SELECT email
From person
Group By email
Having Count(email)>1;
