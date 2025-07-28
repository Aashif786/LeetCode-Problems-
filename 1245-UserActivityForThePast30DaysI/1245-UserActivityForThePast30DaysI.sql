-- Last updated: 7/28/2025, 3:26:29 PM
# Write your MySQL query statement below
SELECT activity_date as day, COUNT(DISTINCT user_id) as active_users
FROM Activity
WHERE datediff('2019-07-27',activity_date)<30 
AND activity_date <= '2019-07-27' 
GROUP BY activity_date