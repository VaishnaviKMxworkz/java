class Convocation{
static String pg;
static String cOu;
static String br;
static String sn;
static String uv;
static String usn;
static int bCh;
public static boolean getConvocation(String programme,String Course,String Branch,String Studentname,String University,String Universityseatnumber,int Batch){
boolean isConvocationForm=false;
pg=programme;
cOu=Course;
br=Branch;
sn=Studentname;
uv=University;
usn=Universityseatnumber;
bCh=Batch;
return isConvocationForm;
}
 public static void readDetails(){
 System.out.println("Programme:"+pg); 
 System.out.println("Course:"+cOu);
 System.out.println("Branch:"+br); 
 System.out.println("Studentname:"+sn);
 System.out.println("University:"+uv);
 System.out.println("Universityseatnumber:"+usn); 
 System.out.println("Batch:"+bCh); 
}
}
