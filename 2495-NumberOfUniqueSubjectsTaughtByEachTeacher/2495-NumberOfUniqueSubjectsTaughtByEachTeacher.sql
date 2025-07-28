-- Last updated: 7/28/2025, 3:25:15 PM
# Write your MySQL query statement below
select teacher_id, count(distinct subject_id) as cnt from teacher 
group by teacher_id;
