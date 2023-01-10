package lianxi3;

public class FactoryPatternDemo{
	public static void main(String[] args){
		ShapeFactory shapeFactory =new ShapeFactory();
		Shape shape1= shapeFactory.getShape("CIRCLE");   //输入要创建类型的名字
		shape1.draw();
		Shape shape2= shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}
}

