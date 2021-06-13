public class Main {

    public static void main(String[] args) {

        int[][] collectionNumber = {
                {9, 3, 5, 4, 8},
                {5, 1, 4, 2, 7},
                {6, 5, 7, 9, 1}
        };

        questionTwo(collectionNumber);
    }

    public static void questionTwo(int[][] collectionNumber) {

        int vertical = collectionNumber.length - 1;
        int horizontal = collectionNumber[0].length - 1;

        int y = vertical / 2;
        int x = horizontal / 2;

        Integer temp = 0;
        Integer result = Integer.MAX_VALUE;

        for (int i = 0; i <= vertical; i++) {

            temp += collectionNumber[i][x];

            if (i == y || i == vertical) {
                if (temp < result){
                    result = temp;
                }
                temp = collectionNumber[i][x];
            }
        }


        temp = 0;

        for (int i = 0; i <= horizontal; i++) {

            temp += collectionNumber[y][i];

            if (i == x || i == horizontal) {
                if (temp < result){
                    result = temp;
                }
                temp = collectionNumber[y][i];
            }
        }

        System.out.println(result);
    }
}
