public class Reverse {
  public static void main(String[] args) {
    int[] array = new int[] { 10, 50, 20, 60, 47, 30 };

    reverse(array);
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  private static void reverse(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      swap(array, i, array.length - i - 1);
    }
  }

  private static void swap(int[] array, int x, int y) {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}
