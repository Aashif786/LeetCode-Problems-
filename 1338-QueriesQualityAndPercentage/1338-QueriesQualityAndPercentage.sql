-- Last updated: 7/28/2025, 3:26:20 PM
# Write your MySQL query statement below
select query_name ,round(avg(rating/position),2) as quality ,round(100*(sum(rating<3)/count(*)),2) as poor_query_percentage 
from queries
group by query_name;