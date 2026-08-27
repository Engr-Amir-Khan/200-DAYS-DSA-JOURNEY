package day39;

public class Constructor {
    public static class Car{
        int price;
        String name;
        String company;

        Car(int price, String name, String company){
            this.price = price;
            this.name = name;
            this.company = company;
        }

        void print(){
            System.out.println("price of car is " + price + " and name of car is " + name + " companyName is " + company );
        }
    }
    static void main(String[] args) {
        Car c1 = new Car(10000,"honda","BYC");
        c1.print();

    }
}
