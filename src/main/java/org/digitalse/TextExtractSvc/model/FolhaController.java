package org.digitalse.TextExtractSvc.model;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.digitalse.TextExtractSvc.dto.FolhaDto;
@RestController
@RequestMapping("/folha")
public class FolhaController {
	
	
	@GetMapping("/{salario}")
	public ResponseEntity<FolhaDto> calcular(@PathVariable float salario){
		return ResponseEntity.ok(new FolhaDto(salario));
	}
	

}