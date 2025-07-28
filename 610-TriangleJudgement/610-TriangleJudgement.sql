-- Last updated: 7/28/2025, 3:27:23 PM
# Write your MySQL query statement below
select x,y,z,
case
    when x+y>z and x+z>y and y+z>x then 'Yes' 
    else 'No'
end as triangle 
from triangle;

