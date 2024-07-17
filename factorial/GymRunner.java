class GymRunner{
	public static void main(String []gym){
		boolean isCreated=Gym.createGymEquipment("Leg Extension Machine");
		System.out.println("Gym Equipment is created:"+isCreated);
		
		isCreated=Gym.createGymEquipment("Chest Press Machine");
		System.out.println("Gym Equipment is created:"+isCreated);
		
		isCreated=Gym.createGymEquipment("Seated Dip Machine");
		System.out.println("Gym Equipment is created:"+isCreated);
		
		isCreated=Gym.createGymEquipment("Chest Fly Machine");
		System.out.println("Gym Equipment is created:"+isCreated);
		
		isCreated=Gym.createGymEquipment("Bench Press");
		System.out.println("Gym Equipment is created:"+isCreated);
		
		isCreated=Gym.createGymEquipment("Incline Bench Press");
		System.out.println("Gym Equipment is created:"+isCreated);
		
		isCreated=Gym.createGymEquipment("Decline Bench Press");
		System.out.println("Gym Equipment is created:"+isCreated);
		
		isCreated=Gym.createGymEquipment("Adjustable Bench");
		System.out.println("Gym Equipment is created:"+isCreated);
		 
		Gym.getGymEquipments();
	
	    boolean isUpdated=Gym.updateGymEquipment("Bench Press","Olympic Barbell");
		System.out.println("Gym Equipment is updated"+isUpdated);
		
		Gym.getGymEquipments();
		
		Gym.deleteGymEquipmentName("Bench Press");
		
		Gym.getGymEquipments();
	}
}