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

//    public List<RepairEntity> byVehicleId(int vehicleId){
//        return repairListRepository.findByVehicleId(vehicleId);
//    }

    public List<RepairEntity> getRepairsByPatente(String patente){
        return repairListRepository.findByPatente(patente);
    }

//    public double valor_reparacion(String tipo_reparacion, String tipo_motor){
//        int valor = 0;
//
//        if (tipo_reparacion == "Reparaciones del Sistema de Frenos") {
//            if ((tipo_motor == "Gasolina") || (tipo_motor == "Diesel")){
//                valor = 120000;
//            }
//            if (tipo_motor == "Hibrido"){
//                valor = 180000;
//            }
//            if (tipo_motor == "Electrico"){
//                valor = 220000;
//            }
//        }
//        if (tipo_reparacion == "Servicio del Sistema de Refrigeracion") {
//            if ((tipo_motor == "Gasolina") || (tipo_motor == "Diesel")){
//                valor = 130000;
//            }
//            if (tipo_motor == "Hibrido"){
//                valor = 190000;
//            }
//            if (tipo_motor == "Electrico"){
//                valor = 230000;
//            }
//        }
//        if (tipo_reparacion == "Reparaciones del Motor") {
//            if (tipo_motor == "Gasolina"){
//                valor = 350000;
//            }
//            if (tipo_motor == "Diesel"){
//                valor = 450000;
//            }
//            if (tipo_motor == "Hibrido"){
//                valor = 700000;
//            }
//            if (tipo_motor == "Electrico"){
//                valor = 800000;
//            }
//        }
//        if (tipo_reparacion == "Reparaciones de la Transmision") {
//            if ((tipo_motor == "Gasolina") || (tipo_motor == "Diesel")){
//                valor = 210000;
//            }
//            if ((tipo_motor == "Hibrido") || (tipo_motor == "Electrico")){
//                valor = 300000;
//            }
//        }
//        if (tipo_reparacion == "Reparacion del Sistema Electrico") {
//            if ((tipo_motor == "Gasolina") || (tipo_motor == "Diesel")){
//                valor = 150000;
//            }
//            if (tipo_motor == "Hibrido"){
//                valor = 200000;
//            }
//            if (tipo_motor == "Electrico"){
//                valor = 250000;
//            }
//        }
//        if (tipo_reparacion == "Reparaciones del Sistema de Escape") {
//            if (tipo_motor == "Gasolina"){
//                valor = 100000;
//            }
//            if (tipo_motor == "Diesel"){
//                valor = 120000;
//            }
//            if (tipo_motor == "Hibrido"){
//                valor = 450000;
//            }
//        }
//        if (tipo_reparacion == "Reparacion de Neumaticos y Ruedas") {
//            if ((tipo_motor == "Gasolina") || (tipo_motor == "Diesel") || (tipo_motor == "Hibrido") || (tipo_motor == "Electrico")){
//                valor = 100000;
//            }
//        }
//        if (tipo_reparacion == "Reparaciones de la Suspension y la Direccion") {
//            if ((tipo_motor == "Gasolina") || (tipo_motor == "Diesel")){
//                valor = 180000;
//            }
//            if (tipo_motor == "Hibrido"){
//                valor = 210000;
//            }
//            if (tipo_motor == "Electrico"){
//                valor = 250000;
//            }
//        }
//        if (tipo_reparacion == "Reparacion del Sistema de Aire Acondicionado y Calefaccion") {
//            if ((tipo_motor == "Gasolina") || (tipo_motor == "Diesel")){
//                valor = 150000;
//            }
//            if ((tipo_motor == "Hibrido") || (tipo_motor == "Electrico")){
//                valor = 180000;
//            }
//        }
//        if (tipo_reparacion == "Reparaciones del Sistema de Combustible") {
//            if (tipo_motor == "Gasolina"){
//                valor = 130000;
//            }
//            if (tipo_motor == "Diesel"){
//                valor = 140000;
//            }
//            if (tipo_motor == "Hibrido"){
//                valor = 220000;
//            }
//        }
//        if (tipo_reparacion == "Reparacion y Reemplazo del Parabrisas y Cristales") {
//            if (((tipo_motor == "Gasolina") || (tipo_motor == "Diesel") || (tipo_motor == "Hibrido") || (tipo_motor == "Electrico"))){
//                valor = 80000;
//            }
//        }
//
//        return valor;
//    }


}
