package autofix.ms_repair_list.controller;

import autofix.ms_repair_list.entity.RepairEntity;
import autofix.ms_repair_list.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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

//    @GetMapping("/byVehicle/{vehicleId}")
//    public ResponseEntity<List<RepairEntity>> getByVehicleId(@PathVariable("vehicleId")int vehicleId){
//        List<RepairEntity> repairs = repairListService.byVehicleId(vehicleId);
//        return ResponseEntity.ok(repairs);
//    }

    @GetMapping("/byVehicle/{patente}")
    public ResponseEntity<List<RepairEntity>> getByPatente(@PathVariable("patente")String patente){
        List<RepairEntity> repairs = repairListService.getVehicleByPatente(patente);
        return ResponseEntity.ok(repairs);
    }


}
