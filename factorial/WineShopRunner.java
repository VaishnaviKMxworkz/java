class WineShopRunner{
	public static void main(String []wineshop){
		
		boolean isAdded=WineShop.addWineBrands("Fratelli");
		System.out.println("addWineBrands is added" + isAdded);
		
		 isAdded=WineShop.addWineBrands("Sula");
		System.out.println("addWineBrands is added" + isAdded);
		
		 isAdded=WineShop.addWineBrands("Big Banyan");
		System.out.println("addWineBrands is added" + isAdded);
		
		 isAdded=WineShop.addWineBrands("Charosa");
		System.out.println("addWineBrands is added" + isAdded);
		
		 isAdded=WineShop.addWineBrands("Dia Red Wine");
		System.out.println("addWineBrands is added" + isAdded);
		
		 isAdded=WineShop.addWineBrands("Grover La REserve");
		System.out.println("addWineBrands is added" + isAdded);
		
		 isAdded=WineShop.addWineBrands("Krsma");
		System.out.println("addWineBrands is added" + isAdded);
		
		isAdded=WineShop.addWineBrands("York");
		System.out.println("addWineBrands is added" + isAdded);
		
		isAdded=WineShop.addWineBrands("Bareffot Cellars");
		System.out.println("addWineBrands is added" + isAdded);
		
		isAdded=WineShop.addWineBrands("Castellare di Castellina");
		System.out.println("addWineBrands is added" + isAdded);
		
		isAdded=WineShop.addWineBrands("Egon Muller");
		System.out.println("addWineBrands is added" + isAdded);
		
		isAdded=WineShop.addWineBrands("Enclave Estates");
		System.out.println("addWineBrands is added" + isAdded);
		
		isAdded=WineShop.addWineBrands("Grover Zampa");
		System.out.println("addWineBrands is added" + isAdded);
		
		isAdded=WineShop.addWineBrands("Myra Misfit");
		System.out.println("addWineBrands is added" + isAdded);
		
		isAdded=WineShop.addWineBrands("Black Cellar");
		System.out.println("addWineBrands is added" + isAdded);
		
		WineShop.getAllBrands();
		
		boolean isUpdated=WineShop.updateWineBrand("Krsma","Penfolds");
		System.out.println("WineShop name is updated"+isUpdated);
		
	    WineShop.getAllBrands();
		
	}
}