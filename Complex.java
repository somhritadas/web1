class Complex
{
double real,img;
Complex(double real,double img)
{
this.real=real; this.img=img;
}
void add(Complex obj){ this.real=this.real+obj.real; this.img=this.img+obj.img;
}
void display()
{
System.out.println("Sum is: "+real+" + "+img+"i");
}
public static void main(String args[])
{

double n1,n2,n3,n4; n1=DOUBLE.parseDouble(args[0]); n2=Double.parseDouble(args[1]);
n3=Double.parseDouble(args[2]); n4=Double.parseDouble(args[3]); Complex num1 = new Complex(n1,n2); Complex num2 = new Complex(n3,n4); num1.add(num2);
num1.display();



}

} 

 
