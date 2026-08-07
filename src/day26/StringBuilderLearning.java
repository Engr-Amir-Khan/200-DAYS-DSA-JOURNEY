package day26;

public class StringBuilderLearning {
    static void main(String[] args) {
        StringBuilder ch = new StringBuilder("amir khan");
        System.out.println(ch.length());
        System.out.println(ch.capacity());
//        convert string builder into string
        String convert = ch.toString();
        System.out.println(convert);

        System.out.println(ch);
        ch.append(" engineer");
        System.out.println(ch);
        //how to deelete
        ch.delete(5, ch.length());
        //how to insert
        ch.insert(5,"khang");
        System.out.println(ch);


    }
}
