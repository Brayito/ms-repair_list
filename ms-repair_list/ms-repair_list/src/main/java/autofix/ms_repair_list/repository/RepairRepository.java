package autofix.ms_repair_list.repository;

import autofix.ms_repair_list.entity.RepairEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairRepository extends JpaRepository<RepairEntity,Integer> {

    List<RepairEntity> findByVehicleId(int vehicleId);


}
