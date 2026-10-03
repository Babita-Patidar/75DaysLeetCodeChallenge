# Write your MySQL query statement below
SELECT name AS customers
FROM customers c
left join orders o
on  c.id=o.customerid
where o.customerid IS null;


