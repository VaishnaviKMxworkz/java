class GoldShopRunner{
	public static void main(String []goldshop){
		
		boolean isAdded=GoldShop.addGoldItem("Anklets");
		System.out.println("addGoldItem is added" + isAdded);
		
		 isAdded=GoldShop.addGoldItem("Gold Coins");
		System.out.println("addGoldItem is added" + isAdded);
		
		 isAdded=GoldShop.addGoldItem("Bangles");
		System.out.println("addGoldItem is added" + isAdded);
		
		 isAdded=GoldShop.addGoldItem("Earings");
		System.out.println("addGoldItem is added" + isAdded);
		
		 isAdded=GoldShop.addGoldItem("Chains");
		System.out.println("addGoldItem is added" + isAdded);
		
		 isAdded=GoldShop.addGoldItem("Pendants");
		System.out.println("addGoldItem is added" + isAdded);
		
		 isAdded=GoldShop.addGoldItem("Mangalsutras");
		System.out.println("addGoldItem is added" + isAdded);
		
		GoldShop.getAllGoldItems();
		
		boolean isUpdated=GoldShop.updateGoldItem("Gold Coins","Rings");
		System.out.println("gold name is updated"+isUpdated);
		
	    GoldShop.getAllGoldItems();
		
	}
}