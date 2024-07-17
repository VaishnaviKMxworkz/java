class Passport{
static String cprLoc;
static int dcdrloc;
static String givenNm;
static String sn;
static String dobt;
static String emails;
static boolean isemail;
static String loginIds;
static String pwds;
static String confirmPwds;
static String hintQs;
static String hintAs;
static String capt;



public static boolean createPassport(String cprLocation,int dcdrlocation,String givenName,
String surname,String dob,String email,boolean isemailLoginSame,String loginId,String pwd,String confirmPwd,String hintQues,String hintAns,String captcha){
boolean iscreatepassport=false;

cprLoc=cprLocation;
dcdrloc=dcdrlocation;
givenNm=givenName;
sn=surname;
dobt=dob;
emails=email;
isemail=isemailLoginSame;
loginIds=loginId;
pwds=pwd;
confirmPwds=confirmPwd;
hintQs=hintQues;
hintAs=hintAns;
capt=captcha;
return iscreatepassport;



}
public static void getpassportDetail(){
	System.out.println("cprLocation:"+cprLoc);
System.out.println("dcdrlocation:"+dcdrloc);
System.out.println("givenName:"+givenNm);
System.out.println("surname:"+sn);
System.out.println("dob:"+dobt);
System.out.println("email:"+emails);

System.out.println("createpassport:"+isemail);
System.out.println("loginId:"+loginIds);
System.out.println("pwd:"+pwds);
System.out.println("confirmPwd:"+confirmPwds);
System.out.println("hintQues:"+hintQs);
System.out.println("hintAns:"+hintAs);
System.out.println("captcha:"+capt);
}
}