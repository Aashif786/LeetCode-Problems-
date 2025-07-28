-- Last updated: 7/28/2025, 3:27:21 PM
# Write your MySQL query statement below
select * from cinema 
where id%2 !=0 and description != 'boring'
order by rating desc;