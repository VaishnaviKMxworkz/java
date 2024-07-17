class WatchShop{
	static String ownerName="Vaishhhh";
	static String watchNames[]={null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addWatchBrandNames(String watchName){
		System.out.println("addWatchBrandNames started");
		boolean isWatchBrandNameAdded=false;
		if(watchNames!=null){
			watchNames[index]=watchName;
			index++;
			isWatchBrandNameAdded=true;
		}else{
			System.out.println("the given watch shop nmae is not valid, give valid name");
		}
		System.out.println("addWatchBrandNames ended");
		return isWatchBrandNameAdded;
	}
	public static void getAllWatchBrands(){
		for(String watchNames:watchNames){
			System.out.println(watchNames);
		}
		return;
	}
	public static boolean updateWatchBrands(String oldWatchBrand,String newWatchBrand){
		System.out.println("updateWatchBrands started");
		boolean isWatchBrandsUpdated=false;
		for(index=0;index<watchNames.length;index++){
			if(oldWatchBrand==watchNames[index]){
				watchNames[index]=newWatchBrand;
				isWatchBrandsUpdated=true;
			}
		}
		if(isWatchBrandsUpdated==false){
			System.out.println("watch name not found"+oldWatchBrand);
		}
		System.out.println("updateWatchBrands ended");
		return isWatchBrandsUpdated;
	}
}