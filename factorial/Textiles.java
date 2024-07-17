class Textiles{
	static String ownerName="Vaishhhh";
	static String textileNames[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMaterial(String textileName){
		System.out.println("addMaterial started");
		boolean isMaterialAdded=false;
		if(textileNames!=null){
			textileNames[index]=textileName;
			index++;
			isMaterialAdded=true;
		}else{
			System.out.println("the given textile material name is not valid, give valid name");
		}
		System.out.println("addMaterial ended");
		return isMaterialAdded;
	}
	public static void getAllMaterialInfo(){
		for(String textileNames:textileNames){
			System.out.println(textileNames);
		}
		return;
	}
	public static boolean updateMaterial(String oldMaterial,String newMaterial){
		System.out.println("updateMaterial started");
		boolean isMaterialUpdated=false;
		for(index=0;index<textileNames.length;index++){
			if(oldMaterial==textileNames[index]){
				textileNames[index]=newMaterial;
				isMaterialUpdated=true;
			}
		}
		if(isMaterialUpdated==false){
			System.out.println("textile name not found"+oldMaterial);
		}
		System.out.println("updateMaterial ended");
		return isMaterialUpdated;
	}
}