public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = {1,2,5};
        boolean resultado = temEsseNumero(2 , vetor);
        System.out.println("tem o número: " + resultado);
    }

    public static boolean temEsseNumero(int valor,int[] vetor){
        return temEsseNumero(valor, vetor, 0, vetor.length - 1);
    }

    // O(logn)
    public static boolean temEsseNumero(int valor,int[] vetor, int inicio, int fim){
        int meio = (fim + inicio)/2;
        if(inicio > fim){
            return false;
        }else if(valor == vetor[meio]){
            return true;
        }
        else if(valor > vetor[meio]){
            temEsseNumero(valor, vetor, meio + 1, fim);
        }else{
            temEsseNumero(valor, vetor, inicio, meio - 1);
        }
        return false;
    }
}
