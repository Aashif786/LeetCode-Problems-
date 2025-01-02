# Write your MySQL query statement below
with cte as (
    select count(*) as ct from users
)
select r.contest_id, round(count(r.user_id)*100/(c.ct),2) as percentage 
from register r, cte c
group by contest_id
order by percentage desc , contest_id;