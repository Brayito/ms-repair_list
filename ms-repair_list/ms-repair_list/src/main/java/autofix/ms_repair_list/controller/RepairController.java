package autofix.ms_repair_list.controller;

import autofix.ms_repair_list.entity.RepairEntity;
import autofix.ms_repair_list.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/repairs")
public class RepairController {

    @Autowired
    RepairService repairListService;
    @Autowired
    private RepairService repairService;

    @GetMapping("/")
    public ResponseEntity<List<RepairEntity>> getAll(){
        List<RepairEntity> repairs = repairListService.getAll();
        if(repairs.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(repairs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RepairEntity> getById(@PathVariable("id") int id){
        RepairEntity repair = repairListService.getRepairListById(id);
        if(repair == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(repair);
    }

    @PostMapping("/")
    public ResponseEntity<RepairEntity> save(@RequestBody RepairEntity repair){
        RepairEntity newRepair = repairService.save(repair);
        System.out.println("Recibido RepairEntity: " + repair.toString());
        return ResponseEntity.ok(newRepair);
    }

    @GetMapping("byRepair/{vehicleRepairId}")
    public ResponseEntity<List<RepairEntity>> getByVehicleRepairId(@PathVariable("vehicleRepairId")int vehicleRepairId){
        List<RepairEntity> repairs = repairListService.byVehicleRepairId(vehicleRepairId);
        return ResponseEntity.ok(repairs);
    }
}
