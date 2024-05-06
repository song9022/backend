package chapter17.printable;

public class SPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("생송 프린터 출력~");
		System.out.println(doc);
	}

}
