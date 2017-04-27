package ood.dip;
/**

 * @author labcode
 * 
 */
public class Main {

	public static void main(String[] args) {
		// 依赖倒置原则示例代码
		System.out.println("This is DIP Main method!");
		Mother mom=new Mother();
		mom.read(new Book());
		mom.read(new Newspaper());
	}

}
