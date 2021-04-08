public class Check {

    public static void main(String[] args){

        int[] data = {3,1,2,7,5};

        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {

            for (int j = 4; j > i; j--) {

               if (data[i] > data [j]) {

                   int box = data[i];

                   data[i] = data[j];

                   data[j] = box;
                } 
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}