package ood.dip;
public class Mother {
	void read(IRead read) {
		System.out.println("Mom is reading");
		read.getContent();
	}
}
