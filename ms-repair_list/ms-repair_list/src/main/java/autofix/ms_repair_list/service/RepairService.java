package autofix.ms_repair_list.service;

import autofix.ms_repair_list.entity.RepairEntity;
import autofix.ms_repair_list.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairService {

    @Autowired
    RepairRepository repairListRepository;

    public List<RepairEntity> getAll(){
        return repairListRepository.findAll();
    }

    public RepairEntity getRepairListById(int id){
        return repairListRepository.findById(id).orElse(null);
    }

    public RepairEntity save(RepairEntity repairList){
        return repairListRepository.save(repairList);
    }

    public List<RepairEntity> byVehicleRepairId(int vehicleRepairId){
        return repairListRepository.findByVehicleRepairId(vehicleRepairId);
    }
}
