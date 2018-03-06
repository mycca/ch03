package cn.itcast.day4;

public class MyClass {

	String name;
	private String sex;
	int age;

	public MyClass() {
	}

	public MyClass(String name) {
		super();
		this.name = name;
	}

	public MyClass(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	private MyClass(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyClass [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	public void method() {
		System.out.println("���ǹ�������ͨ����");
	}

	void method2() {
		System.out.println("����Ĭ�ϵ���ͨ����");
	}

	private void method(int number) {
		System.out.println("����˽�е���ͨ����" + number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
