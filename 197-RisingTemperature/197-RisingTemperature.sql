-- Last updated: 7/28/2025, 3:28:10 PM
# Write your MySQL query statement below
select w1.id as Id from weather w1, weather w2 
where datediff(w1.recorddate,w2.recorddate)=1 and w1.temperature >w2.temperature;