class FoodPanda{
public static double getOrder(String foodName){
	if(foodName=="Chocolate Cake"){
		return 50.00;
	}
	if(foodName=="Smoothie"){
		return 20.00;
	}
	if(foodName=="Donut"){
		return 50.00;
	}
	if(foodName=="Chicken Wings"){
		return 100.00;
	}
	if(foodName=="Chicken Pizza"){
		return 300.00;
	}
	if(foodName=="Orange Juice"){
		return 70.00;
	}
	if(foodName=="Sandwich"){
		return 65.00;
	}
	if(foodName=="Coffee"){
		return 20.00;
	}
	if(foodName=="Cold Coffee"){
		return 50.00;
	}
	if(foodName=="Ice Cream"){
		return 40.00;
	}
	if(foodName=="Tacos"){
		return 50.00;
	}
	if(foodName=="Muffin"){
		return 70.00;
	}
	if(foodName=="Popcorn"){
		return 40.00;
	}
	if(foodName=="Hot Dog"){
		return 80.00;
	}
	if(foodName=="Burger"){
		return 120.00;
	}
	else{
		System.out.println(foodName+"Not found");
	}
	return 0.00;
}
}