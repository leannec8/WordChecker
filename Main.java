import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> words1 = new ArrayList<String>();
        words1.add("an");
        words1.add("band");
        words1.add("band");
        words1.add("abandon");
        WordChecker x = new WordChecker(words1);
        System.out.println(x.isWordChain());

        ArrayList<String> words2 = new ArrayList<String>();
        words2.add("to");
        words2.add("too");
        words2.add("stool");
        words2.add("tools");
        WordChecker y = new WordChecker(words2);
        System.out.println(y.isWordChain());

        ArrayList<String> words3 = new ArrayList<String>();
        words3.add("catch");
        words3.add("bobcat");
        words3.add("catchacat");
        words3.add("cat");
        words3.add("at");
        WordChecker z = new WordChecker(words3);
        System.out.println(z.createList("cat"));
        System.out.println(z.createList("catch"));
        System.out.println(z.createList("dog"));
    }
}

