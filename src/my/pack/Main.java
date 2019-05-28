package my.pack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ololo");
        Arrays.asList(args).forEach(s -> {
            System.out.println(String.format("Hello World, %s!!!", s));
        });
    }
}
