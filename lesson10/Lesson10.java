package lesson10;


import java.util.*;

public class Lesson10 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList(Arrays.asList("Дом", "Том", "Кот", "Кит", "Рот", "Лом", "Кит", "Том", "Воз", "Кит", "Кит", "Дом"));
        Map<String, Integer> resultArray = new HashMap<>();

        crateUniqueWordsArray(arrayList, resultArray);
        getUniqueWords(resultArray);
        getCountForEachWord(resultArray);

//        for (String key : resultArray.keySet()) {
//            System.out.println("Key = " + key + " - " + resultArray.get(key));
//        }
//
//        for (Map.Entry<String, Integer> entry : resultArray.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//        }

    }

    public static void crateUniqueWordsArray (List<String> arrayList, Map<String, Integer> resultArray) {
        for (String arrayValue: arrayList) {
            if (resultArray.containsKey(arrayValue)) {
                Integer value = resultArray.get(arrayValue);
                resultArray.put(arrayValue, ++value);
            } else {
                resultArray.put(arrayValue, 1);
            }
        }
    }

    public static void getUniqueWords(Map<String, Integer> resultArray) {
        System.out.println("Уникальные слова в нашем исходном массиве: " + resultArray.keySet());
    }

    public static void getCountForEachWord(Map<String, Integer> resultArray) {
        for (Map.Entry<String, Integer> entry : resultArray.entrySet()) {
            if ((entry.getValue() % 10 == 2) || (entry.getValue() % 10 == 3) || (entry.getValue() % 10 == 4)) {
                System.out.println("Слово " + entry.getKey() + " встречается " + entry.getValue() + " раза.");
            } else {
                System.out.println("Слово " + entry.getKey() + " встречается " + entry.getValue() + " раз.");
            }
        }
    }

}


