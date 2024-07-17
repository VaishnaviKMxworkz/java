class Zepto{
public static double takeOrder(String foodname){
if(foodname== "Bread Pakora"){
	return 150.00;
}
if(foodname=="Kesari Rasmalai"){
	return 350.00;
}
if(foodname=="samosa Pav"){
	return 559.00;
}
if(foodname=="Moong Dal Halwa"){
    return 109.00;
}
if(foodname=="gulab jaamun"){
    return  65.00;
}
if(foodname=="Poha"){
    return  115.00;
}
if(foodname=="chicken maggi"){
    return  149.00;
}
if(foodname=="medu vada sambar dip"){
    return 109.00;
}
if(foodname=="cheese bun Omelette"){
    return 105.00;
}
if(foodname=="Bun Maska"){
    return 159.00;
}
if(foodname=="Mini Ghee"){
	return 125.00;
}
if(foodname=="Pain au chocolat"){
	return 129.00;
}
if(foodname=="rawa upma"){
	return 115.00;
}
if(foodname=="chocolate chip muffin"){
	return 95.00;
}
if(foodname=="Poha"){
	return 244.00;
}
if(foodname=="Steamed Butter Chicken bao"){
    return 129.00;
}
else{
	System.out.println(foodname+"Not found");
}
return 0.0;
}
}
