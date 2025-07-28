-- Last updated: 7/28/2025, 3:28:16 PM
# Write your MySQL query statement below
select name as customers from customers where id not in(select customerid from orders);