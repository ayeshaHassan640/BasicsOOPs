class Movie {
    String Name;
    int RelaesingYear;
    double Insights;
    String Hero;

    Movie(String N,int R,double I,String H){
        this.Name=N;
        this.RelaesingYear=R;
        this.Insights=I;
        this.Hero=H;
    }
    public void show(){
        System.out.println("Movie Name:"+ Name);
        System.out.println("Releasing Year:"+ RelaesingYear);
        System.out.println("Rating:"+ Insights);
        System.out.println("Actor Name:"+ Hero);

    }

}

