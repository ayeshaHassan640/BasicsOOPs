class Teacher{
    String Name;
    String Subject;
    String Experience;

    //Parametrized Constructor
    Teacher(String N,String S){
        this.Name=N;
        this.Subject=S;

    }

    //Copy Constructor
    Teacher(Teacher other){
        this.Name=other.Name;
        this.Subject=other.Subject;

    }
    public void SetExperience(String SetExperience){
        this.Experience=SetExperience;
    }
    public String GetExperience(){
        return Name+Subject+Experience;
    }
    public void DisplayInfo(){
        System.out.println("Teaher Name:"+ Name);
        System.out.println("Subject Name:"+ Subject);
        System.out.println("Teaher Experience:"+ Experience);
    }
}
