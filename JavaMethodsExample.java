package Java_Basic;


public class JavaMethodsExample
{
    public void welcomeToSDET()
    {
        System.out.println("WELCOME YOU IN OUR ORGANIZATION AS SOFTWARE TESTER");
    }
    public void methodName()
    {
     System.out.println("Hello Java methods");
    }
    public void addition(int a, int b)
    {
        System.out.println(a+b);
    }
    public void multiplication(float a, float b)
    {
        System.out.println(a*b);
    }
    public static void main(String[] args)
    {
     JavaMethodsExample jme = new JavaMethodsExample();
     jme.methodName();
     jme.welcomeToSDET();
     jme.addition(20,30);
     jme.multiplication(10.5f,10.5f);
    }
}
