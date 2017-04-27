package ood.lkp;
/**

 * @author labcode
 * 
 */
public class Main {

	public static void main(String[] args) {
		// 迪米特法则示例代码，最少知识原则
		//汉堡包由牛肉、蔬菜、面包组成，KFC可以做出汉堡包。
		//Lucy、Lily想吃汉堡不需要自己做，可以去KFC买，他们俩只需要使用知道Hamberger类就OK。
		System.out.println("This is LKP Main method!");
		new Lily().eat();
		new Lucy().eat();
	}

}
