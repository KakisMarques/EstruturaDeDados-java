public class pilha2 {
    public static void main(String[] args){}
    private int[] elementos;
    private int topo; 

    
    public pilha2(int tamanhoMaximo) {
        elementos = new int[tamanhoMaximo];
        topo = -1;
    }

    
    public void empilhar(int valor) {
        if (topo < elementos.length - 1) {
            topo++; 
            elementos[topo] = valor; 
            System.out.println("Empilhado: " + valor);
        } else {
            System.out.println("Erro: Pilha cheia! Não foi possível empilhar " + valor);
        }
    }

    
    public int desempilhar() {
        if (topo >= 0) {
            int valorDesempilhado = elementos[topo];
            topo--; 
            System.out.println("Desempilhado: " + valorDesempilhado);
            return valorDesempilhado;
        } else {
            System.out.println("Erro: Pilha vazia! Não é possível desempilhar.");
            return -1; 
        }
    }
    
    
    public boolean isVazia() {
        return topo == -1;
    }
    public int getTopo() {
        return topo;
    }
    public int[] getElementos() { 
        return elementos;
    }
    
    public void mostrar() {
        if (isVazia()) {
            System.out.println("Pilha: [Vazia]");
            return;
        }

        System.out.print("Pilha (Topo -> Base): ");
       
        for (int i = getTopo(); i >= 0; i--) {
            System.out.print("[" + getElementos()[i] + "]");
            if (i > 0) {
                System.out.print(" <- ");
            }
        }
        System.out.println();
    }   
}   

