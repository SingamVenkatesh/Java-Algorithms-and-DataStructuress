package RecursionLearning.GENRERICS;

public class GenericssMain
{
        public static void main(String[] args)
        {
            Box<Integer> intBox = new Box<>();
            Box<String> strBox = new Box<>();
            intBox.set(100);
            intBox.set(200);
            strBox.set("venkat");
            System.out.println(intBox.get()); // Output: 100
            System.out.println(strBox.get());
        }
    }

