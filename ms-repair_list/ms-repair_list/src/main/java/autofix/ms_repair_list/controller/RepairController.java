package autofix.ms_repair_list.controller;

import autofix.ms_repair_list.entity.RepairEntity;
import autofix.ms_repair_list.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.logging.Logger;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/repairs")
public class RepairController {

    // Crear una instancia de Logger para esta clase
    private static final Logger LOGGER = Logger.getLogger(RepairController.class.getName());


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
    public ResponseEntity<RepairEntity> save(@RequestBody RepairEntity repair) {
        try {
            RepairEntity newRepair = repairService.save(repair);
            return ResponseEntity.ok(newRepair);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

//    @GetMapping("/byVehicle/{vehicleId}")
//    public ResponseEntity<List<RepairEntity>> getByVehicleId(@PathVariable("vehicleId")int vehicleId){
//        List<RepairEntity> repairs = repairListService.byVehicleId(vehicleId);
//        return ResponseEntity.ok(repairs);
//    }

    @GetMapping("/byVehicle/{patente}")
    public ResponseEntity<List<RepairEntity>> getByPatente(@PathVariable("patente")String patente){
        List<RepairEntity> repairs = repairListService.getRepairsByPatente(patente);
        return ResponseEntity.ok(repairs);
    }


}
