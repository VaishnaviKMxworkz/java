class FiveStarChicken{
	public static double takeOrder(String foodName){
		if(foodName=="Thai Crispy"){
			return 65.00;
		}
		if(foodName=="Chilli Burst"){
			return 100.00;
		}
		if(foodName=="Crunchy Masala"){
			return 150.00;
		}
		if(foodName=="Hot Crispy Burger"){
			return 150.00;
		}
		if(foodName=="Tandoori Burger"){
			return 80.00;
		}
		if(foodName=="Chicken Cheese Burger"){
			return 120.00;
		}
		if(foodName=="Cheesy Chicken Shots"){
			return 55.00;
		}
		if(foodName=="Hungry Bird Burger"){
			return 75.00;
		}
		if(foodName=="Tandoori Roll"){
			return 80.00;
		}
		if(foodName=="chicken Fingers"){
			return 45.00;
		}
		if(foodName=="Chicken Manchurian"){
			return 70.00;
		}
		if(foodName=="Chicken Roll"){
			return 120.00;
		}
		if(foodName=="Chicken Nuggets"){
			return 45.00;
		}
		if(foodName=="Chicken Strips"){
			return 65.00;
		}
		if(foodName=="Chicken PopCorn"){
			return 55.00;
		}
		else{
			System.out.println(foodName+"Not found");
		}
		return 0.00;
	}
}