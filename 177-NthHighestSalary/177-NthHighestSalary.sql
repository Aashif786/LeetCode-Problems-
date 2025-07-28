-- Last updated: 7/28/2025, 3:28:25 PM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set n = n-1;
  RETURN (
    select distinct(salary) from  Employee
    order by salary desc
    limit n,1
  );
END