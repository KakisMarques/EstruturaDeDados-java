import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
        int[] sequenciaRA = {2, 4, 0, 4, 0, 6, 4};

        ArvoreBinariaBusca bst = new ArvoreBinariaBusca();

        System.out.println("Inserindo os elementos: " + Arrays.toString(sequenciaRA));

        for (int numero : sequenciaRA) {
            bst.inserir(numero);
        }

        System.out.println("\n--- Características da Árvore Resultante ---");

        System.out.print("Percurso Em Ordem (Ordenado): ");
        bst.percursoEmOrdem();
        System.out.println();

        System.out.print("Raiz: ");
        bst.imprimirRaiz();

        System.out.print("Folhas (Nós sem filhos): ");
        bst.imprimirFolhas();
        System.out.println();
        
        System.out.println("Altura da Árvore: " + bst.getAltura());
    }
}
