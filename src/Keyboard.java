import java.lang.String;

public class Keyboard {
    public static void main(String[] args)  {
        char c = new java.util.Scanner(System.in).next().charAt(0);
        System.out.println(
                c == 'q' ? 'm' : c == 'z' ? 'l' : c == 'a' ? 'p' :c == 'p' ? 'o' : c == 'o' ? 'i' : c == 'i' ? 'u' :
                c == 'y' ? 't' : c == 't' ? 'r' : c == 'r' ? 'e' :c == 'e' ? 'w' : c == 'w' ? 'q' :c == 'l' ? 'k' :
                c == 'k' ? 'j' : c == 'j' ? 'h' : c == 'g' ? 'f' : c == 'f' ? 'd' :c == 'd' ? 's' : c == 's' ? 'a' :
                c == 'm' ? 'n' : c == 'n' ? 'b' : c == 'b' ? 'v' : c == 'v' ? 'c' : c == 'c' ? 'x' : c == 'x' ? 'z' : '?'
        );}}