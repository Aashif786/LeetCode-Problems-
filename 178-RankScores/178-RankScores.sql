-- Last updated: 7/28/2025, 3:28:23 PM
# Write your MySQL query statement below
select score , dense_rank() over(order by score desc) as "rank" from scores ;