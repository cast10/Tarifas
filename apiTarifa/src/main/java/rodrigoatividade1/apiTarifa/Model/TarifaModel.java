package rodrigoatividade1.apiTarifa.Model;


import lombok.*;
import rodrigoatividade1.apiTarifa.Model.Enuns.TiposDeTarifas;
import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "tarifas")
public class TarifaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String descricao;

    @Column(length = 30, nullable = false)
    private BigDecimal valor;

    @Column(name = "TiposDeTarifas")
    @Enumerated(value = EnumType.STRING)
    private TiposDeTarifas tiposDeTarifas;
}
