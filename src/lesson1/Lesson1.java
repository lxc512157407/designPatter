package lesson1;
public class Lesson1 {
    public void say(){
        System.out.println("设计模式代表了最佳实践，通常被有经验的面向对象的软件开发人员所采用");
        System.out.println("设计模式的类型主要包括四中模式：创建模式，结构型模式，行为模式，j2ee模式");
        System.out.println("创建模式：这些设计模式提供了创建对象的同时隐藏，创建对象的逻辑的方式。包括（5种模式）：工厂模式，抽象工厂模式，单利模式，建造者模式，原型模式");
        System.out.println("结构型模式：关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。（8种模式）：适配器模式，桥接模式，过滤器模式，组合模式，装饰器模式，外观模式，享元模式，代理模式");
        System.out.println("行为模式：关注对象之间的通信，包括：责任模式，命令模式，解释器模式，迭代器模式，中介者模式，备忘录模式，观察者模式，状态模式，空对象模式，策略模式，模版模式，访问者模式。");
        System.out.println("j2ee模式关注标示层，包括：MVC模式，业务代表模式，组合实体模式，数据访问对象模式，前端控制器模式，拦截过滤器模式，服务定位器模式，传输对象模式");
        System.out.println("设计模式的六大原则：");
        System.out.println("1.开闭原则：对扩展开放，对修改关闭----程序的扩展性好，易于维护升级。");
        System.out.println("2.里氏代换原则：任何基类可以出现的地方，子类一定可以出现");
        System.out.println("3.依赖倒转原则：针对接口编程器，依赖于抽象不依赖于具体");
        System.out.println("4.接口隔离原则：多个隔离的接口，比使用单个接口要好，即降低类之间都耦合度");
        System.out.println("5.迪米特法则：最少知道原则，一个人实体尽量少地与其他实体之间发生相互作用使得系统功能模块相对独立");
        System.out.println("6.合成复用原则：尽量使用合成/聚合的方式，而不是使用继承。");

    }
}