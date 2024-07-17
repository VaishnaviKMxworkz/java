class BlinkIt{
	public static double takeOrder(String foodName){
		if(foodName=="Kurkure Masala Munch Crisps"){
			return 30.00;
		}
		if(foodName=="Thums Up Soft Drink"){
			return 82.00;
		}
		if(foodName=="Doritos Sweet Chilli Flavour Nachos"){
			return 45.00;
		}
		if(foodName=="Sour cream and cheese cream"){
			return 45.00;
		}
		if(foodName=="Butter Popcorn"){
			return 25.00; 
		}
		if(foodName=="Fatafat Bhelpuri"){
			return 45.00;
		}
		if(foodName=="Bhel Sev Bhujia"){
			return 35.00;
		}
		if(foodName=="Garlic Bhujia"){
			return 90.00;
		}
		if(foodName=="Lime soda"){
			return 20.00;
		}
		if(foodName=="Sprite"){
			return 45.00;
		}
		if(foodName=="Coco-cola"){
			return 50.00;
		}
		if(foodName=="Pepsi Soft Drink"){
			return 40.00;
		}
		if(foodName=="Haldiram's Nagpur Masala Kaju"){
			return 50.00;
		}
		else{
			System.out.println(foodName+"Not Found");
		}
		return 0.00;
	}
}