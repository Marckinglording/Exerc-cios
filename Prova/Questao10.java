public class Questao10{

    public static void main (String [] args) {

        int [] nums = {3, 5, 7};

        int Maior = -1;
        int Menor = 999;
 
        for(int i = 1; i <= 3; i++){

            if(nums [i] > Maior){
            Maior = nums [i];
            }

            if(nums [i] < Menor){
            Menor = nums [i];
            }

        }

        System.out.println("O maior número é " + Maior );
        System.out.println("O menor número é " + Menor);

    }

}