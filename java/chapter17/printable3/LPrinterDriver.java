package chapter17.printable3;

public class LPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("엘쥐 프린터 출력~");
		System.out.println(doc);
	}

}
