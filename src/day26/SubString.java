package day26;

public class SubString {
    static void main(String[] args) {
        String name = "Amir";
        System.out.println(name.charAt(1));
//        System.out.println(name.substring(0,3));

        for (int i = 0; i < name.length(); i++) {
            for (int j = i; j <name.length() ; j++) {
                    System.out.print(name.substring(i, j+1) + " ");
            }
            System.out.println();
        }
    }
}
