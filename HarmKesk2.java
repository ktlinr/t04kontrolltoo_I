public class HarmKesk2{

    public static void main(String[] args) {

        int[]array = {10,5,2,7,4,6,3};
        int i=0;
        int summa=0;
        double average=0;
        for( i=0;i<array.length;i++){
            System.out.println(array[i]);
            summa=summa+array[i];
        }
        System.out.println("Arvude summa on:"+summa);
        System.out.println("Arvude keskmine on: "+(double)summa/array.length);

	}

}

