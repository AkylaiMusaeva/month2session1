import java.util.Arrays;

/** Тапшырма-3
 * ГҮЛ ДЕГЕН КЛАСС ТҮЗҮҢҮЗ.
 * ПОЛЕЛЕРИ (FLOWERNAME, FRESHNESS,PRICE)
 * МЕЙНДЕН АНЫН БИР НЕЧЕ ОБЪЕКТТЕРИН
 * ТҮЗҮҢҮЗ, МААНИЛЕРИН БЕРИНИЗ.
 * 1) ГҮЛДҮН МАССИВИН ТҮЗОБУЗ, ГУЛДОРДУ
 * ОШОЛ МАССИВКЕ САЛЫБЫЗ.
 * МЕТОД ТУЗУНУЗ, ПАРАМЕТРИНЕ
 * ГУЛДОЛДУН МАССИВИН АЛСЫН, АНАН
 * МЕТОД ЭН КЫМБАТ ГУЛДУН БААСЫН
 * КАЙТАРСЫН. МЕЙНДЕН ОШОЛ МЕТОДДУ
 * ЧАКЫРЫНЫЗ
 * ГҮЛДҮ АНЫН ЖАҢЫЛЫГЫНА (СВЕЖЕСТЬ)
 * КАРАТА СОРТТОЙБУЗ.
 * ГҮЛДҮ АТЫНА ЖАРАША СОРТТОЙБУЗ
 */
public class Flower {
    String flowerName;
    int freshness;
    int price;

    public Flower(String flowerName, int freshness, int price) {
        this.flowerName = flowerName;
        this.freshness = freshness;
        this.price = price;
    }
    public Flower() {

    }

    public static int MaxPrice(Flower[] flowers) {//Эн кымбат алып беруучу метод
        int max = 0;
        for (int i = 0; i < flowers.length; i++) {
            if (max < flowers[i].price) {
                max = flowers[i].price;
            }
        }
        return max;
    }
    public static int [] sortByFreshness(int []flower){
        Arrays.sort(flower);
        System.out.println(Arrays.toString(flower));
        return flower;
    }
}







