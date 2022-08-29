public class LinearSearch {
  public static void main(String[] args) {
    int[] array = new int[] { 10, 50, 20, 60, 47, 30, 84 };
    int key = 62;

    System.out.println(search(array, key));
  }

  private static int search(int[] array, int key) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == key) {
        return i;
      }
    }
    return -1;
  }
}