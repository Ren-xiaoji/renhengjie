  public static void main(String[] args) {

    int[] arr = new int[100];

    assignment(arr);

  }



  public static void assignment(int[] arr) {

    for (int i = 0; i < arr.length; i++) {

      arr[i] = i + 1;

    }

    System.out.println(Arrays.toString(arr));

  }