-- Last updated: 7/28/2025, 3:26:34 PM
# Write your MySQL query statement below
select round(sum(if(datediff(a.event_date,b.mindate)=1,1,0))/count(distinct a.player_id),2) as fraction
from activity a 
join (
    select player_id,min(event_date) as mindate from activity 
    group by player_id
)as b 
using(player_id);