package rodrigoatividade1.apiTarifa.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rodrigoatividade1.apiTarifa.Model.TarifaModel;
import rodrigoatividade1.apiTarifa.Service.TarifaService;

import java.util.List;

@RestController
public class TarifaController {

    @Autowired
    TarifaService tarifaService;

    @PostMapping (path = "/tarifas")
    public TarifaModel cadastraTarifa (@RequestBody TarifaModel tarifaModel){
        return tarifaService.registraNovaTarifa(tarifaModel);
    }

    @GetMapping(path = "/tarifas")
    public List <TarifaModel> BuscarTarifas(TarifaModel tarifaModel) {
        return tarifaService.buscarTarifas();
    }

    @DeleteMapping(path = "/tarifas/{id}")
    public void deleteTarifa (@PathVariable Long id){
        tarifaService.deletrTarifa(id);

    }

}
