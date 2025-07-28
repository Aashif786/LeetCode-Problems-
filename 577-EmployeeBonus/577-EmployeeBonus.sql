-- Last updated: 7/28/2025, 3:27:31 PM
# Write your MySQL query statement below
select e.name,  b.bonus 
from employee e left join bonus b 
using(empid) 
where coalesce(b.bonus,"") <1000; 