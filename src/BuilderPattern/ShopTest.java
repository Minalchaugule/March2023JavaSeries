package BuilderPattern;

public class ShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shopping sh=new Shopping();
sh.Login("Minal","Minal@123")
               .Searchproduct("Macbook")
               .addtoCart("Macbook")
               .doPayment("@Minu@124uip")
               .generateOrder()
               .logout();

	}

}
