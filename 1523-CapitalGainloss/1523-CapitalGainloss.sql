-- Last updated: 7/28/2025, 3:26:04 PM
select stock_name , 
sum( 
    case 
        when operation= 'Buy' then -price 
        else price 
    end
) as capital_gain_loss 
from stocks 
group by stock_name;