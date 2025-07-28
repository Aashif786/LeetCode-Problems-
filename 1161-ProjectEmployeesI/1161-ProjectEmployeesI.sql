-- Last updated: 7/28/2025, 3:26:35 PM

select p.project_id ,round(avg(e.experience_years),2) as average_years from project p 
left join employee e 
on p.employee_id = e.employee_id
group by p.project_id;