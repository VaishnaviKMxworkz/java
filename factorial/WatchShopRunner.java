class WatchShopRunner{
	public static void main(String []watchshop){
		
		boolean isAdded=WatchShop.addWatchBrandNames("Breitling");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		 isAdded=WatchShop.addWatchBrandNames("Casio");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		 isAdded=WatchShop.addWatchBrandNames("OMEGA");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		 isAdded=WatchShop.addWatchBrandNames("Jaeger-LeCoultre");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		 isAdded=WatchShop.addWatchBrandNames("Rolex");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		 isAdded=WatchShop.addWatchBrandNames("Breguet");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		 isAdded=WatchShop.addWatchBrandNames("Cartier");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		isAdded=WatchShop.addWatchBrandNames("Fossil");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		isAdded=WatchShop.addWatchBrandNames("Rado");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		isAdded=WatchShop.addWatchBrandNames("Longines");
		System.out.println("addWatchBrandNames is added" + isAdded);
		
		WatchShop.getAllWatchBrands();
		
		boolean isUpdated=WatchShop.updateWatchBrands("Rolex","Arcadia Watches");
		System.out.println("watchshop name is updated"+isUpdated);
		
	    WatchShop.getAllWatchBrands();
		
	}
}