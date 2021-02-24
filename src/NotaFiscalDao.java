

public class NotaFiscalDao implements DepoisDeGerarNota{
	
	@Override
    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}