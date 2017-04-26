class A{
   void test()            //Creatimg class A
   {
     System.out.println("I'm from the top class");

   }
}
class B extends A{          //Creatimg class B from A
   void test()
   {
     super.test();      //accessing immediate parent class
     System.out.println("I'm from the middle class");
   }

}
public class C extends B{     //Creatimg class C from B
  
static int x = 0; 
 
public static void main(String[] args) 
{
C m = new C();         //Creating instance for C
                m.go();
        }
        void go()
        {
          super.test();  //accessing immediate parent class
        }
}


//It is not possible to invoke test() method defined in C from a method in A.

//  we need creating a new instance of class C 'm' to access parent class A
