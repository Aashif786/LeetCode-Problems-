-- Last updated: 7/28/2025, 3:26:27 PM
# Write your MySQL query statement below
select author_id as id from views where author_id = viewer_id
group  by author_id
order by author_id;