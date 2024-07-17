class GiriasRunner{
	public static void main(String []gym){
		boolean isCreated=Girias.createHomeAppliance("Leg Extension Machine");
		System.out.println("Gym Equipment is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Refrigerators");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Water Bottle");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Mixer");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Air Conditioner");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Washing Machine");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Smart TV");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Acs");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("SmartPhones");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Electric Stove");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Fan");
		System.out.println("Home Appliances is created:"+isCreated);
		
		isCreated=Girias.createHomeAppliance("Cooker");
		System.out.println("Home Appliances is created:"+isCreated);

         Girias.getHomeAppliance();
		
		boolean isUpdated=Girias.updateHomeAppliances("Fan","Batteris");
		System.out.println("Home Appliances updated:"+isUpdated);
		
		Girias.getHomeAppliance();
	}
}