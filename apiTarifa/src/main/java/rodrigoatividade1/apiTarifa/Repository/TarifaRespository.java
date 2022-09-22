package rodrigoatividade1.apiTarifa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigoatividade1.apiTarifa.Model.TarifaModel;

public interface TarifaRespository extends JpaRepository <TarifaModel,Long> {
}
