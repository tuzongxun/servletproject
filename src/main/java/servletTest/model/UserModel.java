package servletTest.model;

/**
 * 通常用到的类根据功能大致可分为两种：一种是功能类，以方法和逻辑为主，用来处理业务逻辑；一种是实体类，以存放数据为主；
 * 这里是一个简单用户实体类：一般标准的实体类，应该包含至少基本属性、get/set方法、重写的toString方法、构造方法（不写默认就有）
 * 涉及到外部交互的，通常都还要实现序列化，即implements Serializable,
 * 并生成一个serialVersionUID，这里的外部如浏览器、数据库、其他系统
 * 
 * @author tzx
 *
 */
public class UserModel {

	private String name;
	private int age;

	public UserModel() {
		name = "李四";
		age = 25;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User：name=" + name + ", age=" + age;
	}

}
