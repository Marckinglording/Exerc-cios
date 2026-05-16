public class teste02 {
    public static void main(String[] args){

        int[] numero = {12,13,14};
        int maior = 0;
        int menor = 0;

        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i < numero.length; i++){
            a = numero[0];
            b = numero[1];
            c = numero[2];
        }

        maior = ((a > b && a > c) ? a : (b > c ? b : c));
        menor = ((a < b && a < c) ? a : (b < c ? b : c));

        System.out.println(maior);
        System.out.println(menor);


        int[] num = {1,2,3,4,5};
        double media = 0;
        int soma = 0;
        int pares = 0;

        for (int i = 0; i < num.length; i++) {
            soma += num[i];

            if (num[i] % 2 == 0) {
                pares = +1;
            }
        }
        media = soma / numero.length;

        System.out.println(media);
        System.out.println(soma);
        System.out.println(pares);

    }
}
