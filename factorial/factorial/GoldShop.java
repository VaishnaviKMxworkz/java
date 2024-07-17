class GoldShop{
	static String ownerName="Vaishhhh";
	static String goldNames[]={null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addGoldItem(String goldName){
		System.out.println("addGoldItem started");
		boolean isGoldItemAdded=false;
		if(goldNames!=null){
			goldNames[index]=goldName;
			index++;
			isGoldItemAdded=true;
		}else{
			System.out.println("the given gold shop nmae is not valid, give valid name");
		}
		System.out.println("addGoldItem ended");
		return isGoldItemAdded;
	}
	public static void getAllGoldItems(){
		for(String goldNames:goldNames){
			System.out.println(goldNames);
		}
		return;
	}
	public static boolean updateGoldItem(String oldGoldItem,String newGoldItem){
		System.out.println("updateGoldItem started");
		boolean isGoldItemUpdated=false;
		for(index=0;index<goldNames.length;index++){
			if(oldGoldItem==goldNames[index]){
				goldNames[index]=newGoldItem;
				isGoldItemUpdated=true;
			}
		}
		if(isGoldItemUpdated==false){
			System.out.println("gold name not found"+oldGoldItem);
		}
		System.out.println("updateGoldItem ended");
		return isGoldItemUpdated;
	}
}