
	public class EnviadorDeEmail implements DepoisDeGerarNota{
		
		@Override
	    public void executa(NotaFiscal nf) {
	        System.out.println("envia email da nf " + nf.getId());
	    }
}