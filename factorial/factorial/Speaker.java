class Speaker{
static boolean isConnected=false;
static int currentValue=40;
static int maximumValue=100;
public static void onOrOff(){
	System.out.println("onOrOff Started");
	if(isConnected==false){
		isConnected=true;
		System.out.println("Speaker turned on");
	}
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Speaker turned off");
	}else{
	System.out.println("onOrOff ended");
	}
	return;
}
public static void increaseValue(){
				 System.out.println("the incresed value is started");
			if(isConnected == true){	       
				 if(currentValue <= maximumValue){
					    currentValue= currentValue+1 ;
				System.out.println("The current value is "+ currentValue);		
				}else{
						System.out.println("the speaker maximum value is Reached");
					 } 
				System.out.println("the speaker is on");
			}
				 	 System.out.println("the incresase value isended");
				 return ;
				 }
}