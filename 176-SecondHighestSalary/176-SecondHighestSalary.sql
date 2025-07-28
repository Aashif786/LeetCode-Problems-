-- Last updated: 7/28/2025, 3:28:27 PM
# Write your MySQL query statement below
select(select distinct  salary from  Employee
order by salary desc
limit 1,1)

as secondHighestSalary ;