# Домашнее задание 3.11
Реализуйте собственные классы Arrays и Collections, которые будут содержать все реализации методов binarySearch согласно документации Java.

Ваша задача — самостоятельно реализовать все методы binarySearch, которые реализованы для классов Collections и Arrays в Java. Документация доступна по ссылкам: [Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)  и [Collections](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html) соответственно.

Также при реализации методов static int binarySearch(T[] a, T key, Comparator c) и static int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) для класса Arrays и всех методов класса Collections вы встретитесь с объектом Comparator и интерфейсом Comparable, а также с понятием дженериков.

Ваш класс Arrays должен содержать реализации следующих методов:

* static int binarySearch(byte[] a, byte key)- 1 балл
* static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) - 2 балла
* static int binarySearch(char[] a, char key) - 1 балл
* static int binarySearch(char[] a, int fromIndex, int toIndex, char key) - 2 балла
* static int binarySearch(double[] a, double key)- 1 балл
* static int binarySearch(double[] a, int fromIndex, int toIndex, double key)- 2 балла
* static int binarySearch(float[] a, float key) - 1 балл
* static int binarySearch(float[] a, int fromIndex, int toIndex, float key) - 2 балла
* static int binarySearch(int[] a, int key)- 1 балл
* static int binarySearch(int[] a, int fromIndex, int toIndex, int key)- 2 балла
* static int binarySearch(long[] a, long key) - 1 балл
* static int binarySearch(long[] a, int fromIndex, int toIndex, long key) - 2 балла
* static int binarySearch(short[] a, short key)- 1 балл
* static int binarySearch(short[] a, int fromIndex, int toIndex, short key) - 2 балла
* static int binarySearch(T[] a, T key, Comparator c) - 2 балла
* static int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) - 2 балла 

Ваш класс Collections должен содержать реализации следующих методов:

* static int binarySearch(List> list, T key) - 2 балла
* static int binarySearch(List list, T key, Comparator c) - 2 балла