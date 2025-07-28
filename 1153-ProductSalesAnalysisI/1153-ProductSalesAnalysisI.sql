-- Last updated: 7/28/2025, 3:26:37 PM
# Write your MySQL query statement below
select p.product_name, s.year, s.price from Sales s join product p using(product_id);