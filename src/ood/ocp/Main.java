package ood.ocp;
/**

 * @author labcode
 * 
 */
public class Main {

	public static void main(String[] args) {
		// 开放封闭原则示例代码
		System.out.println("This is OCP Main method!");
		ChartDisplayManger manger=new ChartDisplayManger();
		manger.display(new LineChart());
		manger.display(new PieChart());
		manger.display(new BarChart());
	}

}
