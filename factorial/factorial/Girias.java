class Girias{
static String name="New Girias";
static String ownerName="Vaishnavi";
static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean createHomeAppliance(String homeAppliance){
System.out.println("createHomeAppliance started");
boolean isHomeAplliances=false;
if(homeAppliances!=null){
homeAppliances[index]=homeAppliance;
index++;
isHomeAplliances=true;
}else{
System.out.println("the given name is not valid appliances name,give correct name");
}
System.out.println("createHomeAppliance ended");
return isHomeAplliances;
}
public static void getHomeAppliance(){
for(String homeAppliances:homeAppliances){
System.out.println(homeAppliances);
}
return;
}
public static boolean updateHomeAppliances(String oldApplianceName,String newApplianceName){
	System.out.println("updateHomeAppliances started");
	boolean isHomeApplianceUpdated=false;
	for(int index=0;index<homeAppliances.length;index++){
		if(oldApplianceName==homeAppliances[index]){
			homeAppliances[index]=newApplianceName;
			isHomeApplianceUpdated=true;
		}
	}
	if(isHomeApplianceUpdated==false){
		System.out.println("home appliances name not found"+oldApplianceName);
	}
	System.out.println("updateHomeAppliances ended");
	return isHomeApplianceUpdated;
}
}
