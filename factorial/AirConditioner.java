class AirConditioner{
static boolean isConnected=false;
static int currentTemperature=3;
static int minimumTemperature=1;
static int maximumTemperature=6;


public static void onOrOff(){
	System.out.println("onOrOff Started");
	if(isConnected==false){
		isConnected=true;
		System.out.println("AirConditioner turned on");
	}
	else if(isConnected==true){
		isConnected=false;
		System.out.println("AirConditioner turned off");
	}else{
	System.out.println("onOrOff ended");
	}
	return;
}
public static void increaseTemperature(){
				 System.out.println("the increaseTemperature started");
			if(isConnected == true){	       
				 if(currentTemperature <= maximumTemperature){
					    currentTemperature= currentTemperature+1 ;
				System.out.println("The current temperature is "+ currentTemperature);		
				}else{
						System.out.println("maxTemperature Reached");
					 } 
				System.out.println("Air conditioner is on");
			}else{
				 	 System.out.println("increaseTemperature ended");
			}
				 return ;
				 }
public static void decreaseTemperature(){
				 System.out.println("the decreaseTemperature started");
			if(isConnected == true){	       
				 if(currentTemperature >= minimumTemperature){
					    currentTemperature= currentTemperature-1 ;
				System.out.println("The current temperature is "+ currentTemperature);		
				}else{
						System.out.println("minimum Temperature Reached");
					 } 
				System.out.println("Air conditioner is on");
			}else{
				 	 System.out.println("decreaseTemperature ended");
			}
				 return ;
				 }

	
public static void getFeatures(){
	System.out.println("getFeatures started");

	String name="Samsung";
	double price=64000.00;
	System.out.println("name of the product is:"+name);
	System.out.println("price of the product is:"+price);
	System.out.println("getFeatures ended");
	return;
}
}