package rodrigoatividade1.apiTarifa.Model.Enuns;


public enum TiposDeTarifas {
    DESCONTO,
    MULTA,
    SERVICO;

    public TiposDeTarifas getDesconto(){
        return DESCONTO;
    }

    public TiposDeTarifas getMulta(){
        return MULTA;
    }

    public TiposDeTarifas getServico(){
        return SERVICO;

    }

}
