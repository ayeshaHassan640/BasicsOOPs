public class SetGetTest{
    public static void main(String []args){
        Teacher t1=new Teacher("Humera Tariq","OOPS");
        t1.SetExperience("25 Years");
        Teacher t2=new Teacher(t1);
        Teacher t3=new Teacher(t2);
        System.out.println(t1.GetExperience());
        t1.DisplayInfo();
        t2.DisplayInfo();
        t3.DisplayInfo();
    }
}