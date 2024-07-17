class DrivingLicence{
static String nm;
static double adharno;
static boolean isadharno;
static String pN;
static String cPN;
public static boolean getLicence(String name,double adharnumber,boolean isadharnumber,String phoneNumber,String confirmPhoneNumber){
boolean isdrivingLicence=false;
nm=name;
adharno=adharnumber;
isadharno=isadharnumber;
pN=phoneNumber;
cPN=confirmPhoneNumber;

return isdrivingLicence;
}

public static void readLicence(){
System.out.println("name:"+nm);
System.out.println("adharnumber:"+adharno);
System.out.println("isadharnumber:"+isadharno);
System.out.println("phoneNumber:"+pN);
System.out.println("confirmPhoneNumber:"+cPN);
}
}
