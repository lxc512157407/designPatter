package lesson2;
public class Lesson2 {
    private ShapeFactory shapeFactory=new ShapeFactory();
    public void say(){
        System.out.println("工厂模式是java中常用的设计模式之一");
        System.out.println("定一个创建对象的接口，让其子类自己决实例化哪一个工厂类，工厂模式使创建过程延迟到子类进行。");
        System.out.println("主要解决：主要解决接口选择的问题");
        System.out.println("如何使用：明确的计划不同条件下创建不同实例时。");
        System.out.println("如何解决：让其子类实现工厂接口，返回的是一个抽象的产品。");
        System.out.println("关键代码：创建过程在其子类执行。");
        System.out.println("应用实例：1、您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现。 2、Hibernate 换数据库只需换方言和驱动就可以。");
        System.out.println("优点：1、一个调用者想创建一个对象，只要知道其名称就可以了。");
        System.out.println("2.扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。");
        System.out.println("3、屏蔽产品的具体实现，调用者只关心产品的接口。");
        System.out.println("每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。");
    }

    public Shape getShape(ShapeType shapeType){
        return shapeFactory.getShape(shapeType);
    }
}