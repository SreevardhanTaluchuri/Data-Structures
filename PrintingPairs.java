public class PrintingPairs {
  public static void main(String[] args) {
    int[] array = new int[] { 10, 20, 30, 52, 64, 87 };

    print(array);
  }

  private static void print(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        System.out.println(array[i] + "," + array[j]);
      }
    }
  }
}
