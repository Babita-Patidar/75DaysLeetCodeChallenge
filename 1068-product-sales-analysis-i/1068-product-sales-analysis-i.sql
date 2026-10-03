# Write your MySQL query statement below
SELECT s.year,s.price ,p.product_name
FROM sales s
join product p
on s.product_id=p.product_id;
