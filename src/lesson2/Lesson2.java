package lesson2;
public class Lesson2 {
    private ShapeFactory shapeFactory=new ShapeFactory();
    public void say(){
        System.out.println("����ģʽ��java�г��õ����ģʽ֮һ");
        System.out.println("��һ����������Ľӿڣ����������Լ���ʵ������һ�������࣬����ģʽʹ���������ӳٵ�������С�");
        System.out.println("��Ҫ�������Ҫ����ӿ�ѡ�������");
        System.out.println("���ʹ�ã���ȷ�ļƻ���ͬ�����´�����ͬʵ��ʱ��");
        System.out.println("��ν������������ʵ�ֹ����ӿڣ����ص���һ������Ĳ�Ʒ��");
        System.out.println("�ؼ����룺����������������ִ�С�");
        System.out.println("Ӧ��ʵ����1������Ҫһ������������ֱ�Ӵӹ������������������ȥ��������������ô�������ģ��Լ������������ľ���ʵ�֡� 2��Hibernate �����ݿ�ֻ�軻���Ժ������Ϳ��ԡ�");
        System.out.println("�ŵ㣺1��һ���������봴��һ������ֻҪ֪�������ƾͿ����ˡ�");
        System.out.println("2.��չ�Ըߣ����������һ����Ʒ��ֻҪ��չһ��������Ϳ��ԡ�");
        System.out.println("3�����β�Ʒ�ľ���ʵ�֣�������ֻ���Ĳ�Ʒ�Ľӿڡ�");
        System.out.println("ÿ������һ����Ʒʱ������Ҫ����һ��������Ͷ���ʵ�ֹ�����ʹ��ϵͳ����ĸ����ɱ����ӣ���һ���̶���������ϵͳ�ĸ��Ӷȣ�ͬʱҲ������ϵͳ��������������Ⲣ����ʲô���¡�");
    }

    public Shape getShape(ShapeType shapeType){
        return shapeFactory.getShape(shapeType);
    }
}