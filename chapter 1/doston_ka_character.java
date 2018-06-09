import java.util.Random;
class doston_ka_character{

public static void main(String[] args)
{
int n=0;
String[] friendlist={"karan singh","kartik saxena","prateek prabhakar","divya gautam","khitiz","trishna tomar","utkarsh srivastava","rikesh","kapil","sanidhya","amit madnawat","krishna","sumit agarwal","himanshu","ankur","prem kr yadav","shivam mishra","suyash pandey","ravi gupta","asad naiyar","shivam agarwal","ankit kumar rollno 8"," ankit kumar rollno9","satish patel","shivam prtp","krati","sumit chauhan","shivam singhal","shivani parashar","akshita kulshreshtha","arushi","ayushi","harsha sharma"};
String[] Words={"alcoholic","brainless","cockkroach","dumbo","egoist","nuts","satan","affectionate","aggressive","anxious","bad-tempered","big headed","boring","talkative","reliable"};
int length=Words.length;

int l=friendlist.length;
for(int i=0;i<l;i++)
{
int rand=(int)(Math.random()*length);

System.out.println(friendlist[n]+" " + "is " + " "+ Words[rand]);
System.out.println("  ");
n=n+1; 
}
 }
}
