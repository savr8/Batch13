package RecapJavaWithAhmed;

public class StaticPractice {
    public static void main(String[] args) {
        //i am creating an object(account)-->bank of america
        StaticInstanceBlock ahmet = new StaticInstanceBlock();

        ahmet.spendingMoney(300);
        System.out.println(ahmet.money);
        StaticInstanceBlock methmet = new StaticInstanceBlock();
        methmet.spendingMoney(100);
        System.out.println(methmet.money);//100
        System.out.println(ahmet.money);//700
        StaticInstanceBlock.money = 2000;//you can access static variable without creating an object
        StaticInstanceBlock murat = new StaticInstanceBlock();
        StaticInstanceBlock.spendingMoney(100);//no object creation

    }
}
