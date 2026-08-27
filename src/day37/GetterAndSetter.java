package day37;

class person{
    String name;
    int age;
    private int bankDetail;

    int getBankDetail(){  //this is known as getter
        return bankDetail;
    }

    void setBankDetail(int x){
         bankDetail = x;
    }

}
public class GetterAndSetter {
        static void main(String[] args) {
        person p = new person();

//        System.out.println("Bank detail is " + p.getBankDetail()); // get bank detail

            p.setBankDetail(123);
            System.out.println("Bank detail is " + p.getBankDetail());

        }
}
