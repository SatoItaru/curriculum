public class Task1_2 {

    public static void main(String[] args) {

        String[] country = new String[3];

        country[0] = "JAPAN";

        country[1] = "AMERICA";

        country[2] = "KOREA";

        System.out.println(country.length);

        String[] strArray = new String[3];

        strArray[0] = "りんご";

        strArray[1] = "もも";

        strArray[2] = "ぶどう";

        System.out.println(strArray[1]);

//[10,20,30,40,50を要素の値とする配列intArrayを作成]
        int[] intArray = {10,20,30,40,50};

//[上記で作成した配列の2番目と5番目の要素を出力]
        System.out.println(intArray[1]+intArray[4]);
    }
}