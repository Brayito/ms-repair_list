package autofix.ms_repair_list.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class RepairEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;
    private Integer value;


    // *********            Anadir          **************
    // fecha reparacion
    // hora reparacion

    private Integer vehicleId;

    @Override
    public String toString() {
        return "RepairEntity{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                '}';
    }

}
