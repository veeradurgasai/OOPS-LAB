public class avg{

public int findavg(int n1,int n2,int n3)
{
return (n1+n2+n3)/3;
}
public static void main(String[] args){

avg prob = new avg();
int Avg = prob.findavg(50,150,220);

System.out.print("Average of given numbers is : " + Avg);
}
}