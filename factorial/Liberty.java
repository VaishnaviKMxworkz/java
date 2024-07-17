class Liberty{
	static String ownerName="Vaishhhh";
	static String shoeBrandNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addShoeBrands(String shoeName){
		System.out.println("addShoeBrands started");
		boolean isShoeBrandsAdded=false;
		if(shoeBrandNames!=null){
			shoeBrandNames[index]=shoeName;
			index++;
			isShoeBrandsAdded=true;
		}else{
			System.out.println("the given shoe brand nmae is not valid, give valid name");
		}
		System.out.println("addShoeBrands ended");
		return isShoeBrandsAdded;
	}
	public static void getAllShoeBrands(){
		for(String shoeBrandNames:shoeBrandNames){
			System.out.println(shoeBrandNames);
		}
		return;
	}
	public static boolean updateShoeBrand(String oldShoeBrand,String newShoeBrand){
		System.out.println("updateShoeBrand started");
		boolean isShoeBrandsUpdated=false;
		for(index=0;index<shoeBrandNames.length;index++){
			if(oldShoeBrand==shoeBrandNames[index]){
				shoeBrandNames[index]=newShoeBrand;
				isShoeBrandsUpdated=true;
			}
		}
		if(isShoeBrandsUpdated==false){
			System.out.println("shoe name not found"+oldShoeBrand);
		}
		System.out.println("updateShoeBrand ended");
		return isShoeBrandsUpdated;
	}
}