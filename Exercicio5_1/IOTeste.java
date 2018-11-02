package Exercicio5_1;

public class IOTeste {
	
public static void main(String[] args) {
		
		IOFacade iof = new IOFacade();
		byte[] byteArray = {0,1,2,3,4};
		iof.gravarArquivoBinario("sys.bin", byteArray);
		iof.lerArquivoBinario("sys.bin");
		iof.gravarArquivoTexto("sys.txt", "conteudo teste");
		iof.lerArquivoTexto("sys.txt");
	}
}
