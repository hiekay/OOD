package ood.srp;
/**

 * @author labcode
 * 
 */
public class Main {

	public static void main(String[] args) {
		//单一职责原则示例代码
		//CustomerChart类只用来显示用户表信息
		//CustomerDao类只用来处理数据源
		System.out.println("This is SRP Main method!");
		CustomerChart customerchart= new CustomerChart();
		customerchart.setDao(new CustomerDao());
		customerchart.displayChart();
	}
}
