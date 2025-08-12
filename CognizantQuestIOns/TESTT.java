package CognizantQuestIOns;

public class TESTT {
    public static void main(String[] args) {
        try {
            throw  new EXceptttiion("THis is");
        }
        catch (EXceptttiion e)
        {
            System.out.println("Caouht");
            System.out.println(e.getMessage());
        }
    }
}
