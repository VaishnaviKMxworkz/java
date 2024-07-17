import java.util.*;
class Gym{
static String name="New GYm";
static String ownerName="Vaishnavi";
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int index;

public static boolean createGymEquipment(String gymEquipment){
System.out.println("createGymEquipment started");
boolean isGymEquipmentName=false;
if(gymEquipments!=null){
gymEquipments[index]=gymEquipment;
index++;
isGymEquipmentName=true;
}else{
System.out.println("the given name is not valid equipment name,give correct name");
}
System.out.println("createGymEquipment ended");
return isGymEquipmentName;
}
public static void getGymEquipments(){
for(String gymEquipments:gymEquipments){
System.out.println(gymEquipments);
}
return;
}
public static boolean updateGymEquipment(String oldEquipmentName,String newEquipmentName){
	System.out.println("updateGymEquipment started");
	boolean isGymEQuipmentUpdated=false;
	for(int index=0;index<gymEquipments.length;index++){
		if(oldEquipmentName==gymEquipments[index]){
			gymEquipments[index]=newEquipmentName;
			isGymEQuipmentUpdated=true;
		}
	}
	if(isGymEQuipmentUpdated==false){
		System.out.println("gym equipment name not found"+oldEquipmentName);
	}
	System.out.println("updateGymEquipment ended");
	return isGymEQuipmentUpdated;
}
public static boolean deleteGymEquipmentName(String gymEquipmentNameTobeDeleted){
	System.out.println("gymEquipmentNameTobeDeleted started");
	boolean isGymEquipmentNameDeleted=false;
	int oldIndex, newIndex;
	for( oldIndex=0, newIndex=0;oldIndex<gymEquipments.length;oldIndex++){
		if(gymEquipments[oldIndex]!=gymEquipmentNameTobeDeleted){
			gymEquipments[newIndex]=gymEquipments[oldIndex]; 
			newIndex++;
		}
	}
	gymEquipments=Arrays.copyOf(gymEquipments,newIndex);
	if(gymEquipments!=null){
		isGymEquipmentNameDeleted=true;
	}
	if(isGymEquipmentNameDeleted==false){
		System.out.println("Gym Equipemnt name not found"+gymEquipmentNameTobeDeleted);
	}
	System.out.println("gymEquipmentNameTobeDeleted ended");
	return isGymEquipmentNameDeleted;
}
}
