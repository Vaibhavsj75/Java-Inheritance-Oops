class Human1 // superclass // Base class // Parent class
{
    private String name;
    int age;

    Human1()
    {
        System.out.println("HUman class Constructor");
    }
    void sleep()
    {
        age=18;
        System.out.println("Human needs a good sleep");
        System.out.println(age);
    }
}
class Student extends Human1 // Child class // sub class // derived class
{
    // public Student1
    // {
    //     super();
    // }
    void disp()
    {
        System.out.println("the age is: "+ age);
        // System.out.println("The name is:"+ name);
    }
}
class Inheritance2
{

    public static void main(String[] args) {
        
        Student st=new Student();
        st.sleep();
        st.disp();
    }
}