public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {1,2,3,4,-35,6,7,8,0};
        int[] resultado = mm(vetor);
        System.out.println("Maior:" + resultado[0] + " Menor: " + resultado[1]);
    }

    //Linear: O(n)
    public static int[] mm(int[] vetor){
        int[] m = {vetor[0], vetor[0]};
        for(int i = 1; i < vetor.length; i++){
            if(m[0] < vetor[i])
                m[0] = vetor[i];
            if(m[1] > vetor[i])
                m[1] = vetor[i];
        }
        return m;
    }
}
