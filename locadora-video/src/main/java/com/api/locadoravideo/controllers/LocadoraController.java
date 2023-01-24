package com.api.locadoravideo.controllers;

import com.api.locadoravideo.services.LocadoraService;

public class LocadoraController {

    final LocadoraService locadoraService;

    public LocadoraController(LocadoraService locadoraService) {
        this.locadoraService = locadoraService;
    }

//    @PostMapping
//    public ResponseEntity<Object> savelocadora(@RequestBody @Valid LocadoraDto locadoraDto){
//        if(calcularTaxaAtraso().existsByLicensePlateCar(locadoraDto.getLicensePlateCar())){
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Taxa ainda não foi paga!");
//        }
//
//    }


}
