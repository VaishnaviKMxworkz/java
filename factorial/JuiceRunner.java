class JuiceRunner{
public static void main(String []juicename){
	boolean isAdded=JuiceName.createJuiceName("Slice");
	System.out.println("is juice name added:"+isAdded);

	boolean priceAdded=JuiceName.addJuicePrice(50.0);
	System.out.println("price is added:"+priceAdded);
	
 isAdded=JuiceName.createJuiceName("Maaza");
	System.out.println("is juice name added:"+isAdded);
     priceAdded=JuiceName.addJuicePrice(30.0);
	System.out.println("price is added:"+priceAdded);
	
	 isAdded=JuiceName.createJuiceName("SugerCane");
	System.out.println("is juice name added:"+isAdded);
	priceAdded=JuiceName.addJuicePrice(20.0);
	System.out.println("price is added:"+priceAdded);
	
	 isAdded=JuiceName.createJuiceName("Sprite");
	System.out.println("is juice name added:"+isAdded);
	priceAdded=JuiceName.addJuicePrice(40.0);
	System.out.println("price is added:"+priceAdded);
	
	isAdded=JuiceName.createJuiceName("Fizz");
	System.out.println("is juice name added:"+isAdded);
	priceAdded=JuiceName.addJuicePrice(50.0);
	System.out.println("price is added:"+priceAdded);
	
	 isAdded=JuiceName.createJuiceName("Apple");
	System.out.println("is juice name added:"+isAdded);
	priceAdded=JuiceName.addJuicePrice(50.0);
	System.out.println("price is added:"+priceAdded);
	
	JuiceName.getJuiceNames();
	
	JuiceName.getJuicePrices();
	
	boolean isUpdated=JuiceName.updateJuiceNames("Fizz","Strawberry");
	System.out.println("Juice Name is updated"+isUpdated);
	
	JuiceName.getJuiceNames();
	
	JuiceName.deleteJuiceName("Sprite");
	
	JuiceName.getJuiceNames();
}
}
