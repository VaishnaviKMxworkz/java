class Television{
static boolean isConnected=false;
static int currentval=8;
static int maxval=10;
static int minval;
public static void onORoff(){
System.out.println("onORoff is started");
if(isConnected==false){
 isConnected=true;
System.out.println("the TV is on");
}else if(isConnected==true){
isConnected=false;
System.out.println("the TV is off");
}
System.out.println("the onORoff is ended");
return;
}
public static void increasesval(){
	System.out.println("the increasesval is started");
	if(isConnected==true){
		if(currentval<=maxval){
			currentval=currentval+1;
			System.out.println("the increases valuem is:"+currentval);
		}else{
			System.out.println("the value will crosed");
		
	    }
	 System.out.println("could you on the TV");
	}
System.out.println("the increasesval is ended");
return;
}
public static void decreasesval(){
	System.out.println("the dereases value is started");
	if(isConnected==true){
		if(currentval<=maxval){
			currentval=currentval-1;
			System.out.println("the decreases value is:"+currentval);
		}else{
			System.out.println("the value will crosed");
		
	    }
	 System.out.println("could you on the TV");
	}else{
System.out.println("the decreases value is ended");
	}
return;
}
public static void getdetail(){
	System.out.println("the detail of the product started");
	String name="TV";
	int id=4;
	double price=1000.00;
	System.out.println("the name of the product is "+name);
	System.out.println("the id of the product is :"+id);
	System.out.println("the price of the product is:"+price);
	System.out.println("the detail of the product is ended");
}
}
