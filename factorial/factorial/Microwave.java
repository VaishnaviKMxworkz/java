class Microwave{
static boolean isConnected=false;
static int currentTemperature=4;
static int maximumTemperature=10;
public static void onOrOff(){
	System.out.println("onOrOff Started");
	if(isConnected==false){
		isConnected=true;
		System.out.println("Microwave turned on");
	}
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Microwave turned off");
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
				System.out.println("the microwave is on");
			}
				 	 System.out.println("increaseTemperature ended");
				 return ;
				 }
}