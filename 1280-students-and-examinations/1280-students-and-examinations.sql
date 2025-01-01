# Write your MySQL query statement below
select s.student_id , s.student_name, ss.subject_name,count(e.subject_name) as attended_exams  
from students s 
cross join subjects ss 
left join examinations e 
on s.student_id = e.student_id and ss.subject_name = e.subject_name
GROUP BY s.student_id, s.student_name, ss.subject_name
order by s.student_id,ss.subject_name;