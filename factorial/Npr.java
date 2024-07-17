class Npr{
public static void main(String npr[]){
	//npr=n!/(n-r)!
	int p=10;
	int r=5;
int nprValue=Factorial.toGetFact(p)/(Factorial.toGetFact(p-r));
System.out.println("the npr value is:"+nprValue);
}
}