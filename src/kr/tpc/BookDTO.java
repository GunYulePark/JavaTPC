package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	// ����Ʈ ������ �޼���(������)
	public BookDTO() {
		// ��ü�� �����ϴ� �۾� ���� (���� �ڵ� �ܿ��� heap�޸𸮿� ����)
		// �׷��鼭 �ڱ��ڽ��� ����Ű�� 'this'��� ��ü�� ���������.
		super();
	}
}
