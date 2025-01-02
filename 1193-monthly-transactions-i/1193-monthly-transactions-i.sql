select substr(trans_date,1,7) AS month,
country,
count(id) as trans_count,
sum(CASE WHEN state = 'approved' THEN 1 else 0 END) as approved_count,
sum(amount) as trans_total_amount,
sum(CASE WHEN state = 'approved' THEN amount else 0 end)  as approved_total_amount

from transactions

group by month,country ;
