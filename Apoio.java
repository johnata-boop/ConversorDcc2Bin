class Apoio{

 public  String converte(int dec) {
   int resto;
   int[] vetor = new int [10];
   int i = 0;
   String bin = "";

     while ( dec>= 2 ){
       resto = dec % 2;
       vetor[i++] = resto;
       dec = dec / 2;
     }
      vetor [i] = dec;

      for (int x=i; x>=0; x--){
        //System.out.print(vetor[x]);
        bin = bin + Integer.toString(vetor[x]);
      }
         // System.out.print(bin);

         return bin; //@todo




  }
}