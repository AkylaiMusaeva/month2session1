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

public class PersonAgeSortVersion2 {
    String fullName;
    int age;
    char gender;
    public PersonAgeSortVersion2(String fullName,int age,char gender){
        this.fullName=fullName;
        this.age=age;
        this.gender=gender;
    }
    public PersonAgeSortVersion2(){
    }
        public static int [] sortByAge(int []people){
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        int []mas=new int[people.length];
        for(int i=0;i< people.length;i++){
            mas[i]=people[people.length-1-i];
        }
        return mas;
        }
    }

