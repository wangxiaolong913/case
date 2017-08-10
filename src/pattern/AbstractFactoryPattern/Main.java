/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月10日 
 * @Description : 抽象工厂方法
 * @check
 */
package pattern.AbstractFactoryPattern;

/**
 * @author wang.xiaolong
 *
 */
public class Main {
	public static void main(String[] args) {
		FacoryProducer fp = new FacoryProducer();
		AbstractFactory af = fp.getFactory("shape");
		Shape shape = af.getShape("circle");
		shape.draw();
		AbstractFactory af2 = fp.getFactory("color");
		Color color = af2.getColor("red");
		color.fill();

		// AbstractFactory af = FacoryProducer.getFactory("shape");
	}

}
