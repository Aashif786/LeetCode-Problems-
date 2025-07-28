-- Last updated: 7/28/2025, 3:27:25 PM
# Write your MySQL query statement below
select max(num) as num 
from(
    select num from mynumbers group by num having count(num) =1
) as a;