public class PrintingSubArrays {
  public static void main(String[] args) {
    int[] array = new int[] { 10, 20, 30, 52, 64, 87 };

    print(array);
  }

  private static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(array[k] + ",");
        }
        System.out.println();
      }
    }
  }
}
