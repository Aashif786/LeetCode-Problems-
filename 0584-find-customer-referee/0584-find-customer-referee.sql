# Write your MySQL query statement below
select name from customer where coalesce(referee_id,"") != 2;