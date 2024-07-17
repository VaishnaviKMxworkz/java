class TextilesRunner{
	public static void main(String []textiles){
		
		boolean isAdded=Textiles.addMaterial("Cotton");
		System.out.println("addMaterial is added" + isAdded);
		
		 isAdded=Textiles.addMaterial("Velvet");
		System.out.println("addMaterial is added" + isAdded);
		
		 isAdded=Textiles.addMaterial("Jersey");
		System.out.println("addMaterial is added" + isAdded);
		
		 isAdded=Textiles.addMaterial("Silk");
		System.out.println("addMaterial is added" + isAdded);
		
		 isAdded=Textiles.addMaterial("Wool");
		System.out.println("addMaterial is added" + isAdded);
		
		 isAdded=Textiles.addMaterial("Denim");
		System.out.println("addMaterial is added" + isAdded);
		
		 isAdded=Textiles.addMaterial("Satin");
		System.out.println("addMaterial is added" + isAdded);
		
		isAdded=Textiles.addMaterial("Linen");
		System.out.println("addMaterial is added" + isAdded);
		
		isAdded=Textiles.addMaterial("Rayon");
		System.out.println("addMaterial is added" + isAdded);
		
		isAdded=Textiles.addMaterial("Chiffon");
		System.out.println("addMaterial is added" + isAdded);
		
		isAdded=Textiles.addMaterial("Baize");
		System.out.println("addMaterial is added" + isAdded);
		
		isAdded=Textiles.addMaterial("Dimity");
		System.out.println("addMaterial is added" + isAdded);
		
		isAdded=Textiles.addMaterial("Drill");
		System.out.println("addMaterial is added" + isAdded);
		
		isAdded=Textiles.addMaterial("Proplin");
		System.out.println("addMaterial is added" + isAdded);
		
		Textiles.getAllMaterialInfo();
		
		boolean isUpdated=Textiles.updateMaterial("Baize","Georgette");
		System.out.println("textile name is updated"+isUpdated);
		
	    Textiles.getAllMaterialInfo();
		
	}
}