import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Класс HomeWorkTest включает модульные тесты для проверки функциональности
 * операций двоичного поиска как в списках, так и в массивах.
 * Он использует утверждения, чтобы убедиться, что результаты двоичного поиска
 * соответствуют ожидаемым индексам как для элементов в коллекции или массиве, так и для отсутствующих элементов.
 * Этот класс использует вспомогательные методы для централизации логики утверждений.
 * Тестируемые методы двоичного поиска включают:
 *   - Collections.binarySearch: для поиска в списках.
 *   - Arrays.binarySearch: для поиска в массивах.
 * Метод testBinarySearch имеет аннотацию @Test, указывающую на то, что это
 * тестовый пример для проверки правильности операций двоичного поиска.
 */
public class HomeWorkTest {

    @Test
    public void testBinarySearch() {
        List<Integer> list = List.of(1, 3, 4);
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();

        assertBinarySearchResults(list, 1, 0);
        assertBinarySearchResults(list, 3, 1);
        assertBinarySearchResults(list, 4, 2);
        assertBinarySearchResults(list, 5, -4);

        assertBinarySearchResults(array, 1, 0);
        assertBinarySearchResults(array, 3, 1);
        assertBinarySearchResults(array, 4, 2);
        assertBinarySearchResults(array, 5, -4);

        List<Double> values = List.of(1.1, 2.2, 3.3);
        double[] doubles = values.stream().mapToDouble(Double::doubleValue).toArray();
        assertEquals(0, Arrays.binarySearch(doubles,1.1));
        assertEquals(1, Arrays.binarySearch(doubles,2.2));
        assertEquals(2, Arrays.binarySearch(doubles,3.3));
        assertNotEquals(3, Arrays.binarySearch(doubles,4.4));

        List<String> strings = List.of("One", "Three", "Two");
        String[] stringsArray = strings.toArray(String[]::new);
        assertEquals(0, Arrays.binarySearch(stringsArray,"One", Comparator.naturalOrder()));
        assertEquals(1, Arrays.binarySearch(stringsArray,"Three", Comparator.naturalOrder()));
        assertEquals(2, Arrays.binarySearch(stringsArray,"Two", Comparator.naturalOrder()));
        assertNotEquals(4, Arrays.binarySearch(stringsArray,"Four", Comparator.naturalOrder()));



    }

    private void assertBinarySearchResults(List<Integer> list, int key, int expectedIndex) {
        assertEquals(expectedIndex, Collections.binarySearch(list, key));
    }

    private void assertBinarySearchResults(int[] array, int key, int expectedIndex) {
        assertEquals(expectedIndex, Arrays.binarySearch(array, key));
    }
}