class Ncrr{
public static void main(String ncr[]){
	////nCr​=nPr​​ / r!= n!​ / (r! (n-r)!)
	int n=10;
	int r=5;
int ncrValue=Factorial.toGetFact(n)/(Factorial.toGetFact(r)*Factorial.toGetFact(n-r));
System.out.println("the npr value is:"+ncrValue);
}
}