public class BinarySearch {
  public static void main(String[] args) {
    int[] array = new int[] { 10, 20, 30, 52, 64, 87 };
    int key = 1;

    System.out.println(search(array, key));
  }

  private static int search(int[] array, int key) {
    int left = 0;
    int right = array.length;
    int mid = left + (right - left) / 2;

    while (right >= 0 && left <= array.length) {
      if (key == array[mid]) {
        return mid;
      } else if (key < array[mid]) {
        right = mid - 1;
        mid = left + (right - left) / 2;
      } else if (key > array[mid]) {
        left = mid + 1;
        mid = left + (right - left) / 2;
      } else {
        break;
      }
    }
    return -1;
  }
}
