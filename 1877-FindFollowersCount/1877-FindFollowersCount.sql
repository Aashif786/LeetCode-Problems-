-- Last updated: 7/28/2025, 3:25:42 PM
select  user_id , count(follower_id ) 
as followers_count 
from followers 
group by user_id 
order by user_id ;
