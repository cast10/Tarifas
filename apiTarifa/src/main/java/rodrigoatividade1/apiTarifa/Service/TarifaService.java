package rodrigoatividade1.apiTarifa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rodrigoatividade1.apiTarifa.Model.TarifaModel;
import rodrigoatividade1.apiTarifa.Repository.TarifaRespository;

import java.util.List;
@Service
public class TarifaService {

    @Autowired
    private TarifaRespository tarifaRespository;

    //cadastrar nova tarifa//
    public TarifaModel registraNovaTarifa(TarifaModel tarifaModel){

        tarifaModel.getId();
        tarifaModel.getDescricao();
        tarifaModel.getValor();
        tarifaModel.getTiposDeTarifas();

        return tarifaRespository.save(tarifaModel);
    }

    //consultar todas as tarifas cadastradas//

    public List <TarifaModel> buscarTarifas(){
        return tarifaRespository.findAll();
    }
    //Delete Tarifas//
    public void deletrTarifa (Long id){
        tarifaRespository.deleteById(id);
    }


}
