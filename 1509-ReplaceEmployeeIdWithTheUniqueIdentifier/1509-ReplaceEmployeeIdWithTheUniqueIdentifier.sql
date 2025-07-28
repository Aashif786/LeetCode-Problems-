-- Last updated: 7/28/2025, 3:26:07 PM
# Write your MySQL query statement below
select e2.unique_id ,  e1.name 
from employees e1 
left join employeeuni e2
on e1.id=e2.id
order by e1.name;