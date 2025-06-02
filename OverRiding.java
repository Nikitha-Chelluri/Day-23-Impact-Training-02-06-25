// Runtime Polymorphism
// Write a java program to create a base class sports with a method called play(). 
// Create three subclasses: Football, BasketBall, and rugby. 
// Override the play() method in each subclass to play a specific statement for each sport.
import java.util.*;
class Sports {
    public void play()
    {
        System.out.println("Playing Sports");
    }
}
class Football extends Sports {
    public void play(){
        System.out.println("playing football");
    }
}

class BasketBall extends Sports {
    public void play(){
        System.out.println("playing BasketBall");
    }
}

class Rugby extends Sports {
    public void play(){
        System.out.println("playing Rugby");
    }
}

class OverRiding{
    public static void main(String[] args){
        Sports sp = new Sports();
        Football foot = new Football();
        Rugby rug = new Rugby();
        sp.play();
        foot.play();
        rug.play();
    }
}


