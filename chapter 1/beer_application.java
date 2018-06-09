class beer_application{

public static void main(String[] args)
{
int num=5;
int balance=0;
String word="bottles";
 
while(num>0){
if(num==1){
word="bottle";
}
System.out.println("there are "+ num +" "+word+" on the walls" );
System.out.println(num+" "+word+" on the wall");
System.out.println("Take one down");
System.out.println("pass it to the customer ");

System.out.println("take 130 ruppes ");
System.out.println("beer bar account balance is ");
balance=balance+130;
System.out.println(balance);
num=num-1;

System.out.println("");


if(num==0){

System.out.println("no beers available just go to home bustard!!");

System.out.println("todays total collection is "+balance);
}
}
}
}
