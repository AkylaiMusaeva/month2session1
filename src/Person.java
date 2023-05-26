import java.util.Arrays;
/**Тапшырма1
 * "Person" деген классын түзүңүз.
 Полелери: (fullname, age , gender) болсун.
 2. Person-дун 5 обьектисин тузуп, полелерине
 маани бериниз.
 3. Бардык адамдарды бир массивге сал.
 4. Адамдарды жашы боюнча сорттогон  эки
 кайтаруучу метод тузунуз. Бир метод чонунан
 кичинесини карай сорттосун экинчи метод
 кичинесинен чонуна карай сорттосун*/
public class Person {
    String fullName;
    int age;
    char gender;

    public Person(String fullName,int age,char gender){
        this.fullName=fullName;
        this.age=age;
        this.gender=gender;

    }

    static  public Person[] sortByAge(Person []people){
        for (int i = 0; i < people.length-1; i++) {
            for (int j = i+1; j < people.length; j++) {
                if(people[i].age>people[j].age){
                    Person age=people[i];
                    people[i]=people[j];
                    people[j]=age;
                }
            }
        }return people;
    }
}
