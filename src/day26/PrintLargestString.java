package day26;

public class PrintLargestString {
    public static void PrintingString(String one, String two){

        int result = one.compareTo(two);
        if(result==0){
            System.out.println("string are lexographically equal");
        }else if(result<0){
            System.out.println("string two is greater");
        }else{
            System.out.println("string one is greater");
        }

    }

    static void main(String[] args) {
        String str1 = "banana";
        String str2 = "apple";
        PrintingString(str1, str2);

    }
}
