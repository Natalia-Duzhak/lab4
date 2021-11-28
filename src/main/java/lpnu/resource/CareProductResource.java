package lpnu.resource;

import lpnu.dto.CareProductDTO;
import lpnu.service.CareProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CareProductResource {

    @Autowired
    private CareProductService careProductService;


    @GetMapping("/care-products")
    public List<CareProductDTO> getAllCareProducts() {
        return careProductService.getAllCareProducts();
    }

    @GetMapping("/care-products/{id}")
    public CareProductDTO getCareProductById(@PathVariable final long id) {
        return careProductService.getCareProductById(id);
    }


    @PostMapping("/care-products")
    public CareProductDTO saveCareProduct(@RequestBody @Validated final CareProductDTO careProductDTO) {
        return careProductService.saveCareProduct(careProductDTO);
    }


    @PutMapping("/care-products")
    public CareProductDTO updateCareProduct(@RequestBody @Validated final CareProductDTO careProductDTO) {
        return careProductService.updateCareProduct(careProductDTO);
    }


    @DeleteMapping("/care-products/{id}")
    public ResponseEntity deleteCareProductById(@PathVariable final long id) {
        careProductService.deleteCareProductById(id);
        return ResponseEntity.ok().build();
    }


}
