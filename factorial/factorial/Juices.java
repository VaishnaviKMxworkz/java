class Juices{
 static String name="";
 static String ownerName="";
 static juiceNames[]={null,null,null,null,null,null};
 static int index;
 
 public static boolean createJuiceName(String juiceName){
	 System.out.println("createJuiceName started");
	 boolean isJuiceNameCreated=false;
	 if(juiceName!=null){
		 juiceNames[index]=juiceName;
		 index++;
		 isJuiceNameCreated=true;
	 }else{
		 System.out.println(Juice name is null, cannot be created");
	 }
	return isJuiceNameCreated;
 }
}
	  
 