-- Last updated: 7/28/2025, 3:26:39 PM
# Write your MySQL query statement below
select customer_id from customer
group by customer_id
having count(distinct product_key)=(select count(*)from product);
