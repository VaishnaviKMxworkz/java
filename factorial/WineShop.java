class WineShop{
	static String ownerName="Vaishhhh";
	static String wineBrandNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addWineBrands(String wineName){
		
		System.out.println("addWineBrands started");
		boolean isWineBrandsAdded=false;
		if(wineBrandNames!=null){
			wineBrandNames[index]=wineName;
			index++;
			isWineBrandsAdded=true;
		}else{
			System.out.println("the given wine brand nmae is not valid, give valid name");
		}
		System.out.println("addWineBrands ended");
		return isWineBrandsAdded;
	}
	public static void getAllBrands(){
		for(String wineBrandNames:wineBrandNames){
			System.out.println(wineBrandNames);
		}
		return;
	}
	public static boolean updateWineBrand(String oldWineBrand,String newWineBrand){
		System.out.println("updateWineBrand started");
		boolean isWineBrandsUpdated=false;
		for(index=0;index<wineBrandNames.length;index++){
			if(oldWineBrand==wineBrandNames[index]){
				wineBrandNames[index]=newWineBrand;
				isWineBrandsUpdated=true;
			}
		}
		if(isWineBrandsUpdated==false){
			System.out.println("wine name not found"+oldWineBrand);
		}
		System.out.println("updateWineBrand ended");
		return isWineBrandsUpdated;
	}
}