class LibertyRunner{
	public static void main(String []shoe){
		
		boolean isAdded=Liberty.addShoeBrands("Skechers");
		System.out.println("addShoeBrands is added" + isAdded);
		
		 isAdded=Liberty.addShoeBrands("Adidas");
		System.out.println("addShoeBrands is added" + isAdded);
		
		 isAdded=Liberty.addShoeBrands("Bata");
		System.out.println("addShoeBrands is added" + isAdded);
		
		 isAdded=Liberty.addShoeBrands("Nike");
		System.out.println("addShoeBrands is added" + isAdded);
		
		 isAdded=Liberty.addShoeBrands("Puma");
		System.out.println("addShoeBrands is added" + isAdded);
		
		 isAdded=Liberty.addShoeBrands("New Balance");
		System.out.println("addShoeBrands is added" + isAdded);
		
		 isAdded=Liberty.addShoeBrands("Reebok");
		System.out.println("addShoeBrands is added" + isAdded);
		
		isAdded=Liberty.addShoeBrands("Vans");
		System.out.println("addShoeBrands is added" + isAdded);
		
		isAdded=Liberty.addShoeBrands("Birkenstock");
		System.out.println("addShoeBrands is added" + isAdded);
		
		isAdded=Liberty.addShoeBrands("Converse");
		System.out.println("addShoeBrands is added" + isAdded);
		
		isAdded=Liberty.addShoeBrands("Fila");
		System.out.println("addShoeBrands is added" + isAdded);
		
		isAdded=Liberty.addShoeBrands("Sorel");
		System.out.println("addShoeBrands is added" + isAdded);
		
		isAdded=Liberty.addShoeBrands("Woodland");
		System.out.println("addShoeBrands is added" + isAdded);
		
		isAdded=Liberty.addShoeBrands("Cole Haan");
		System.out.println("addShoeBrands is added" + isAdded);
		
		isAdded=Liberty.addShoeBrands("Lee Cooper");
		System.out.println("addShoeBrands is added" + isAdded);
		
		Liberty.getAllShoeBrands();
		
		boolean isUpdated=Liberty.updateShoeBrand("Vans","Red Tape");
		System.out.println("shoe brand name is updated"+isUpdated);
		
	    Liberty.getAllShoeBrands();
		
	}
}