import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Тапшырма 1(My version with Array sort)
       /* PersonAgeSortVersion2 personAgeSortVersion2=new PersonAgeSortVersion2("Azat",22,'M');
        PersonAgeSortVersion2 personAgeSortVersion21=new PersonAgeSortVersion2("Farida",25,'F');
        PersonAgeSortVersion2 personAgeSortVersion22=new PersonAgeSortVersion2("Kutman",30,'M');
        PersonAgeSortVersion2 personAgeSortVersion23=new PersonAgeSortVersion2("Nurgul",52,'F');
        PersonAgeSortVersion2 personAgeSortVersion24=new PersonAgeSortVersion2("Asan",11,'M');

        int[]array={personAgeSortVersion2.age,personAgeSortVersion21.age,
                personAgeSortVersion22.age,personAgeSortVersion23.age,personAgeSortVersion24.age};
        System.out.println(Arrays.toString(PersonAgeSortVersion2.sortByAge(array)));*/

        //Тапшырма1(Mentor's version without Array sort)
       /* Person[] people = {new Person("Asan",50,'M'),
                new Person("Amina",12,'F'),
                new Person("Ariet",18,'M'),
                new Person("Anara",51,'F'),
                new Person("Timur",2,'M')};
        Person []sortedPeople=Person.sortByAge(people);
        System.out.println("По возрастанию ");
        for (int i = 0; i < sortedPeople.length; i++) {
            System.out.println(sortedPeople[i].fullName+" "+sortedPeople[i].age+" ");
        }*/


        //Тапшырма2
        /*Student []people={new Student("Akylai",21,"Java"),
                          new Student("Aizat",20,"JS"),
                          new Student("Azamat",25,"JS"),
                          new Student("Anara",47,"Java"),
                          new Student("Zamir",31,"Java")};

        System.out.println(Student.getInfo(people));*/


        //Тапшырма3(сделала как попало(максимум отдельно и сорт отдельно,хотела отсортировать по ккфн
      /* Flower []flowers={new Flower("rose",5,180),
                          new Flower("pions",4,250),
                          new Flower("lilac",8,130),
                          new Flower("orchid",3,300)};
       System.out.println("Самый дорогой цветок стоит  -> "+Flower.MaxPrice(flowers));*/

       /* Flower flowers1=new Flower("rose",5,180);
        Flower flowers2=new Flower("pions",4,250);
        Flower flowers3=new Flower("lilac",8,130);
        Flower flowers4=new Flower("orchid",3,300);
        int []arrayOfFreshness={flowers1.freshness,flowers2.freshness,flowers3.freshness,flowers4.freshness};
        System.out.println("Порядок цветов по их свежести -> ");
        System.out.println(Arrays.toString(Flower.sortByFreshness(arrayOfFreshness)));*/

        Flower []flowers={new Flower("rose",5,180),
                new Flower("pions",4,250),
                new Flower("lilac",8,130),
                new Flower("orchid",3,300)};
        System.out.println("Самый дорогой цветок стоит  -> "+Flower.MaxPrice(flowers));
        int [] arrayOfFreshness=new int[flowers.length];
        for (int j = 0; j < arrayOfFreshness.length; j++){
          for(int i=0;i<flowers.length;i++) {
               arrayOfFreshness[j] = flowers[i].freshness;
            }
        }System.out.println(Arrays.toString(Flower.sortByFreshness(arrayOfFreshness)));











//        for(int i=0;i< sortedFlowers.length;i++){
//            System.out.println(sortedFlowers[i].flowerName+" "+sortedFlowers[i].freshness);
//        }



    }
    }
