package ood.dip;
public class Book implements IRead {
	@Override
	public void getContent() {
		System.out.println("阿里巴巴技术手册");
	}
}
