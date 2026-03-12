public class Q3_Turtle{
    String species;
    int age;

    public Q3_Turtle(String species,int age){
        this.species = species;
        this.age = age;
    }
     public void showDetail(){
        System.out.println("species:"+species+",age"+age+"years old");
     }

     public static void main(String[]args){
        Q3_Turtle myTurtle = new Q3_Turtle("green watermelon",50)
        myTurtle.showDetail();
        }
}