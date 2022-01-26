public class Main {
    public static void main(String[] args) {

        Product milk = new Product(123, "milk",10,"Slovyanochka 2.5",Category.MILK);
        Product milk1 = new Product(124, "milk1",11,"Mlekovita 2.5",Category.MILK);
        Product milk2 = new Product(125, "milk2",12,"Prastokvashino 2.5",Category.MILK);
        Product meatpork= new Product(126, "pork poland",100,"pork meat 5",Category.MEAT);
        Product meatbeef = new Product(127, "beef ukrainian",110,"beef meat",Category.MEAT);
        Product meatchicken = new Product(128, "nasha ryaba",50,"chicken meat",Category.MEAT);
        Product salmon = new Product(129, "salmon norway",200,"sea fish",Category.FISH);
        Product dorado = new Product(130, "dorado italy",160,"sea fish",Category.FISH);
        Product carp = new Product(131, "carp ukrainian ",90,"river fish",Category.FISH);

        Product[] products = {milk, milk1, milk2, meatpork, meatbeef, meatchicken, salmon, dorado, carp};

        Product [] milkarr = new Product[products.length];
        Product [] meatarr = new Product[products.length];
        Product [] fisharr = new Product[products.length];

        int n = 0;
        int m = 0;
         for (int i = 0;i< products.length;i++) {

             if (products[i].getCategory().equals(Category.MILK)) {
                 milkarr[i] = products[i];
             }

             if (products[i].getCategory().equals(Category.MEAT)) {
                 meatarr[i] = products[i];
             }
             if (products[i].getCategory().equals(Category.FISH)) {
                 fisharr[i] = products[i];

             }
             if (products[i].getPrice() < 100) {
                 n ++;
                 System.out.println(products[i].getPrice());
             }
             if (products[i].getName().matches("(.*)ukrainian(.*)")) {
                 m++;
                 System.out.println(products[i].getName());
             }
         }
       /* int n = 0;
        int m = 0;
        for (Product arr : products) {

            if (arr.price. < 100) {
                n = n+1;
                System.out.println(arr.price);

            } if (arr.description.contains("Ukrainian")) {
                m = m+1;
                System.out.println(arr.description);
            }
        }*/
    }
}
