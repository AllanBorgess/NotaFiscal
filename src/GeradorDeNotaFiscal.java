
import java.util.List;

public class GeradorDeNotaFiscal {

	private List<DepoisDeGerarNota> acoes;

    public GeradorDeNotaFiscal(List<DepoisDeGerarNota> acoes) {
		this.acoes = acoes;
        
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for (DepoisDeGerarNota acaoAposGerarNota : acoes) {
			acaoAposGerarNota.executa(nf);
		}

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}