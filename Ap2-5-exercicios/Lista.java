public class Lista {
    public static void main(String[] args){}
    private int[] elementos = new int[5];
    private int tamanhoAtual = 0;

    public void inserir(int valor) {
        if (tamanhoAtual < elementos.length) {
            elementos[tamanhoAtual] = valor;
            tamanhoAtual++;
            System.out.println("Inserido na lista: " + valor);
        } else {
            System.out.println("Erro: Lista cheia! Não foi possível inserir " + valor);
        }
    }
    

    public boolean isVazia() {
        return tamanhoAtual == 0;
    }
    public int getTamanhoAtual() {
        return tamanhoAtual;
    }
    public int[] getElementos() {
        return elementos;
    }
    
    public void mostrar() {
        if (isVazia()) {
            System.out.println("Lista: [Vazia]");
            return;
        }
        
        System.out.print("Lista (Total de " + getTamanhoAtual() + " elementos): ");
        for (int i = 0; i < getTamanhoAtual(); i++) {
            System.out.print("[" + getElementos()[i] + "]");
            if (i < getTamanhoAtual() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}

   