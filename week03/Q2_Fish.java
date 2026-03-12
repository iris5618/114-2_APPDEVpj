public class Q2_Fish{
    String name;
    double weight;

    public void displaylnfo(){
        System.out.println("This fish's name is:"+name+",weight:"+weight+"kg");
    }

    public static void main(String[] args){
        Q2_Fish myFish = new Q2_Fish();

        myFish.name="black tuna";
        myFish.weight=250.5;

        myFish.displaylnfo();
    }
}