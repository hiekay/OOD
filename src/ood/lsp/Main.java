package ood.lsp;
/**

 * @author labcode
 * 
 */
public class Main {

	public static void main(String[] args) {
		// 里氏替换原则示例代码
		System.out.println("This is LSP Main method!");
		Soldier soldier=new Soldier();
		
		//步枪、手枪可以通过
		soldier.killEnemy(new Rifle());
		soldier.killEnemy(new HandGun());
		//玩具枪通不过
		//soldier.killEnemy(new ToyGun());
	}

}
