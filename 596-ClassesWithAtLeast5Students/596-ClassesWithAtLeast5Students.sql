-- Last updated: 7/28/2025, 3:27:26 PM
# Write your MySQL query statement below
select class from courses
group by class
having count(student)>4;