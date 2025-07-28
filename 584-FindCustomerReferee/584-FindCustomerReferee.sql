-- Last updated: 7/28/2025, 3:27:30 PM
# Write your MySQL query statement below
select name from customer where coalesce(referee_id,"") != 2;