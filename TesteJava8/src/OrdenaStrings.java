import java.util.*;
import java.util.function.Consumer;


public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

	palavras.sort(comparing(String::length));

        System.out.println(palavras);

        palavras.forEach(System.out::println);
    }


    static class ComparadorPorTamanho implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            if (s1.length() < s2.length())
                return -1;
            if (s1.length() > s2.length())
                return 1;
            return 0;
        }
    }




}
