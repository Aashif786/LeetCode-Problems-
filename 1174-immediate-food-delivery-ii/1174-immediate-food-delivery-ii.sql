select round(sum(if(order_date = customer_pref_delivery_date,1,0)) /count(*)*100,2)  
as immediate_percentage from delivery 
where (customer_id,order_date) in (Select customer_id, min(order_date) from Delivery group by customer_id)