package src.loops;

public class Task1_6 {
  public static void main(String[] args) {
   int tableSize = 10; // размер таблицы умножения

   for (int i = 1; i <= tableSize; i++) {
    for (int j = 1; j <= tableSize; j++) {
     System.out.printf("%4d", i * j); // выравнивание по правому краю
    }
    System.out.println(); // переход на новую строку после каждого столбца
   }
  }
 }