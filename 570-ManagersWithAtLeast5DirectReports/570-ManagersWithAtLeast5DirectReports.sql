-- Last updated: 7/28/2025, 3:27:33 PM
# Write your MySQL query statement below
select name from employee
where id in(
    select managerid from employee
    group by managerId
    having count(managerId) >=5
);