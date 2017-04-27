package ood.isp;
/**

 * @author labcode
 * 
 */
public class Main {
	public static void main(String[] args) {
		// 接口隔离原则示例代码，接口尽量小，但是有限度。
		//Searcher类定义一个导演找一个女演员
		//SearcherB类定义一个导演找一个女模特
		//IGoodGirl接口定义漂亮、气质好的标准
		//INiceFigure接口定义身材好的标准
		//BasePrettyGirl抽象类实现IGoodGirl、INiceFigure两个接口
		//AngelaBaby类继承BasePrettyGirl类
		System.out.println("This is ISP Main method!");
		System.out.println("----------------");
		Searcher search=new Searcher();
		search.searchActress(new AngelaBaby());
		
		System.out.println("----------------");
		SearcherB searcherb=new SearcherB();
		searcherb.searchSuperModel(new AngelaBaby());
	}
}
