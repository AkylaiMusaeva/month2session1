import java.lang.ref.SoftReference;

/** Тапшырма-2 СОЗДАЙТЕ КЛАСС STUDENT С
 ПОЛЯМИ (NAME, AGE, GROUP), В MAIN
 МЕТОДЕ СОЗДАЙТЕ 5 ОБЬЕКТОВ
 КЛАССА STUDENT , ДАЙТЕ ЗНАЧЕНИЕ
 ПОЛЯМ, ГРУППА МОЖЕТ БЫТЬ ТОЛЬКО
 "JAVA" ИЛИ "JS" ВСЕ 5 СТУДЕНТОВ
 ДОЛЖНЫ БЫТЬ В МАССИВЕ. ТЕПЕРЬ
 ПОСЧИТАЙТЕ СКОЛЬКО СТУДЕНТОВ ИЗ
 "JAVA" И "JS"
 2). А ТЕПЕРЬ ПОСЧИТАЙТЕ И ВЫВЕДИТЕ
 СРЕДНЕЕ АРИФМЕТИЧЕСКОЕ ЗНАЧЕНИЕ
 ВОЗВРАСТОВ ВСЕХ СТУДЕНТОВ*/
public class Student {
    String name;
    int age;
    String group;

    public Student (String name,int age,String group){
        this.name=name;
        this.age=age;
        this.group=group;
    }
    public Student(){
    }
    public static double getInfo(Student[]people){
        int javaCounter=0;
        double arith=0;
        for(Student p:people){
            arith+=p.age;
            if(p.group.equals("Java")){
                javaCounter++;
            }
        }System.out.println("Количество студентов,обучающихся на Java -> "+javaCounter);
        System.out.println("Количество студентов,обучающихся на JS -> "+(people.length-javaCounter));
        System.out.println("Среднее арифметическое возрастов студентов "+(arith/5));
        return 0;
    }
}
