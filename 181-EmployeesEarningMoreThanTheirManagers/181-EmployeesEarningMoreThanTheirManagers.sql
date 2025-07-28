-- Last updated: 7/28/2025, 3:28:20 PM

select t1.name as Employee 
from employee t1
join employee t2 
on t1.managerid = t2.id
where t1.salary > t2.salary ;