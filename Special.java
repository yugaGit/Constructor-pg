//constructor overloading 

 public class Special{
    
        Special(String a,int b)
        {
            System.out.println(a+"\n"+b);
        }
        Special(int c,double d)
        {
            System.out.println(c*d);
        }
        Special(String a,int b,int c)
        {
            System.out.println(a+"\n"+b+c);
        }
    public static void main(String[]ar){
        //Special ob1=new Special(3,2.5);
        Special ob2=new Special("Raj",01);
        Special ob1=new Special(3,2.5);
        Special ob3=new Special("Naveen",2,3);
        
        } 

    }

