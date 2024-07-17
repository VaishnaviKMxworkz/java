class Dominos{
public static double takeOrder(String foodname){
if(foodname== "pizza"){
	return 99.00;
}
if(foodname=="cheese overload"){
	return 639.00;
}
if(foodname=="chicken pepperoni"){
	return 559.00;
}
if(foodname=="garlicBreadsticks"){
    return 138.00;
}
if(foodname=="roasted chicken wings"){
    return  169.00;
}
if(foodname=="tacoMexicana non veg"){
    return  160.00;
}
if(foodname=="chickenparcel"){
    return  59.00;
}
if(foodname=="golden corn"){
    return 89.00;
}
if(foodname=="clasic"){
    return 89.00;
}
if(foodname=="onion"){
    return 69.00;
}
if(foodname=="cheken meatballs"){
	return 149.00;
}
if(foodname=="margherita"){
	return 338.00;
}
if(foodname=="farmhouse"){
	return 459.00;
}
if(foodname=="achariDo pyaza"){
	return 329.00;
}
if(foodname=="Indi Tandoori Paneer"){
	return 648.00;
}
if(foodname=="checken dominator"){
    return 698.00;
}
else{
	System.out.println(foodname+"Not found");
}
return 0.0;
}
}
