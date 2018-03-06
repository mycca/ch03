package cn.itcast.day4;

/*
 * 获取字节码文件对象
 */
public class Demo01Class {
	public static void main(String[] args) throws Exception {
		// 1：通过对象获取字节码文件对象
		// MyClass mc = new MyClass();
		// Class class1 = mc.getClass();

		// 2:通过静态属性class获取字节码文件对象
		// Class<MyClass> class2 = MyClass.class;
		// Class class2 = String.class;
		// Class class2 = int.class;
		Class class2 = int[].class;

		// 3:通过Class.forName() 方法
		Class class3 = Class.forName("cn.itcast.day4.MyClass");

		// System.out.println(class1);
		// System.out.println(class2);
		 System.out.println(class3);
	}
}
