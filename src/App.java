public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = {25,30, 31};
        int[] resultado = m3(vetor);
        System.out.println("1º maior: " + resultado[0] + "\n2º maior: " + resultado[1] + " \n3º maior: " + resultado[2]);
    }

    //Linear: O(n)
    public static int[] m3(int[] vetor){
        int[] m = {vetor[0], vetor[1], vetor[2]};
        for(int i = 0; i < vetor.length; i++){
            if(m[0] < vetor[i]){
                m[2] = m[1];
                m[1] = m[0];
                m[0] = vetor[i];
            }
            else if(m[1] < vetor[i]){
                m[2] = m[1];
                m[1] = vetor[i];
            }else if(m[2] < vetor[i] || (m[2] > m[1])){
                m[2] = vetor[i];
            }

            
        }
        return m;
    }
}
