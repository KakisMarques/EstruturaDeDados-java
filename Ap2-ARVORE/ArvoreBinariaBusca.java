import java.lang.Math;

class ArvoreBinariaBusca {

    private No raiz;

    public ArvoreBinariaBusca() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRec(this.raiz, valor);
    }

    private No inserirRec(No noAtual, int valor) {
        if (noAtual == null) {
            return new No(valor);
        }

        if (valor < noAtual.valor) {
            noAtual.esquerda = inserirRec(noAtual.esquerda, valor);
        } else if (valor > noAtual.valor) {
            noAtual.direita = inserirRec(noAtual.direita, valor);
        }
        

        return noAtual;
    }


    public void percursoEmOrdem() {
        percursoEmOrdemRec(this.raiz);
    }

    private void percursoEmOrdemRec(No noAtual) {
        if (noAtual != null) {
            percursoEmOrdemRec(noAtual.esquerda);
            System.out.print(noAtual.valor + " ");
            percursoEmOrdemRec(noAtual.direita);
        }
    }

    public void imprimirRaiz() {
        if (this.raiz == null) {
            System.out.println("Árvore está vazia.");
        } else {
            System.out.println(this.raiz.valor);
        }
    }

    public void imprimirFolhas() {
        imprimirFolhasRec(this.raiz);
    }

    private void imprimirFolhasRec(No noAtual) {
        if (noAtual == null) {
            return;
        }

        if (noAtual.esquerda == null && noAtual.direita == null) {
            System.out.print(noAtual.valor + " ");
        }

        imprimirFolhasRec(noAtual.esquerda);
        imprimirFolhasRec(noAtual.direita);
    }

    public int getAltura() {
        return getAlturaRec(this.raiz);
    }

    private int getAlturaRec(No noAtual) {
        if (noAtual == null) {
            return -1;
        }

        int alturaEsq = getAlturaRec(noAtual.esquerda);
        int alturaDir = getAlturaRec(noAtual.direita);

        return 1 + Math.max(alturaEsq, alturaDir);
    }
}