import java.util.*;

class JuiceName{
 static String name="Juice Shop";
 static String ownerName="Vaishhhhh";
 static String juiceNames[]={null,null,null,null,null,null};
 static double juicePrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
 static int juiceNameIndex;
 static int juicePriceIndex;
 
 public static boolean createJuiceName(String juiceName){
	 System.out.println("createJuiceName started");
	 boolean isJuiceNameCreated=false;
	 //validation
	 if(juiceName!=null){
		 juiceNames[juiceNameIndex]=juiceName;
		 juiceNameIndex++;
		 isJuiceNameCreated=true;
	 }else{
		 System.out.println("Juice name is null, cannot be created");
	 }
	 System.out.println("createJuiceName ended");
	return isJuiceNameCreated;
 }
 public static boolean addJuicePrice(double juicePrice){
	 System.out.println("addJuicePrice added");
	 boolean isJuiceAdded=false;
	 if(juicePrice>0.0){
		 juicePrices[juicePriceIndex]=juicePrice;
		 juicePriceIndex++;
		 
	 }else{
		 System.out.println("Juice price cannot be found");
	 }
	 System.out.println("addJuicePrice ended");
		 return isJuiceAdded;
	 }
	 
 public static void getJuiceNames(){
	 for(String juiceName:juiceNames){
		 System.out.println(juiceName);
	 }
	 return ;
}
public static void getJuicePrices(){
	for(double juiceName:juicePrices){
		System.out.println(juiceName);
	}
	return;
}
public static boolean updateJuiceNames(String oldJuiceName,String newJuiceName){
	System.out.println("updateJuiceNames started");
	boolean isJuiceNameUpdated=false;
	for(int index=0;index<juiceNames.length;index++){
		if(oldJuiceName==juiceNames[index]){
			juiceNames[index]=newJuiceName;
			isJuiceNameUpdated=true;
		}
	}
	if(isJuiceNameUpdated==false){
		System.out.println("juice name not found"+oldJuiceName);
	}
	System.out.println("updateJuiceNames ended");
	return isJuiceNameUpdated;
}
public static boolean deleteJuiceName(String juiceNameTobeDeleted){
	System.out.println("deleteJuiceName started");
	boolean isJuiceNameDeleted=false;
	int oldIndex, newIndex;
	for( oldIndex=0, newIndex=0;oldIndex<juiceNames.length;oldIndex++){
		if(juiceNames[oldIndex]!=juiceNameTobeDeleted){
			juiceNames[newIndex]=juiceNames[oldIndex];
			newIndex++;
		}
	}
	juiceNames=Arrays.copyOf(juiceNames,newIndex);
	if(juiceNames!=null){
		isJuiceNameDeleted=true;
	}
	if(isJuiceNameDeleted==false){
		System.out.println("juice name not found"+juiceNameTobeDeleted);
	}
	System.out.println("deleteJuiceName ended");
	return isJuiceNameDeleted;
}
}
	  
 