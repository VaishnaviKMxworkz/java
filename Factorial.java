class Factorial {

public static int toGetFact(int factNumber){
int fact=1;
for(int num=1;num<=factNumber;num++){
fact=num*fact;
}
return fact;
}
}