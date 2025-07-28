-- Last updated: 7/28/2025, 3:25:44 PM
# Write your MySQL query statement below
select tweet_id from tweets where char_length(content)>15;