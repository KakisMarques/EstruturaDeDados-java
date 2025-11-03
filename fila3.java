public class fila3 {
    private final int CAPACIDADE = 5; 
    private int[] elementos = new int[CAPACIDADE];
    private int frente = 0;  
    private int fim = 0;      
    private int contador = 0; 

   
    public fila3() {
        
    }

    public void enfileirar(int valor) {
        if (contador < CAPACIDADE) {
            elementos[fim] = valor;
            fim = (fim + 1) % CAPACIDADE; 
            contador++;
            System.out.println("Enfileirado: " + valor);
        } else {
            System.out.println("Erro: Fila cheia! Não foi possível enfileirar " + valor);
        }
    }

    public int desenfileirar() {
        if (contador > 0) {
            int valorDesenfileirado = elementos[frente];
            frente = (frente + 1) % CAPACIDADE; 
            contador--;
            System.out.println("Desenfileirado: " + valorDesenfileirado);
            return valorDesenfileirado;
        } else {
            System.out.println("Erro: Fila vazia! Não é possível desenfileirar.");
            return -1; 
        }
    }
    
    public boolean isVazia() {
        return contador == 0;
    }
    public int getFrente() {
        return frente;
    }
    public int getContador() {
        return contador;
    }
    public int getCapacidade() {
        return CAPACIDADE;
    }
    public int[] getElementos() { 
        return elementos;
    }
    
 
    public void mostrar() {
        if (isVazia()) {
            System.out.println("Fila: [Vazia]");
            return;
        }

        System.out.print("Fila (Frente -> Fim): ");
        int indice = getFrente();
       
        for (int i = 0; i < getContador(); i++) {
            System.out.print("[" + getElementos()[indice] + "]");
            
            indice = (indice + 1) % getCapacidade();
            
            if (i < getContador() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}    

