-- Last updated: 7/28/2025, 3:28:18 PM
select email from person group by email having count(email)!=1;