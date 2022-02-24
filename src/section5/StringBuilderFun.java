package section5;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hareesh Sikakollu");
        sb.append(" is Amazing");
        System.out.println(sb);

        sb.insert(7," Chakravarthy");
        System.out.println(sb);

        sb.replace(34,41,"Awesome ");
        System.out.println(sb);

        sb.delete(8,21);
        System.out.println(sb);
    }
}
