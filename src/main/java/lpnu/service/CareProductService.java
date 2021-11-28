package lpnu.service;



import lpnu.dto.CareProductDTO;

import java.util.List;

public interface CareProductService {
    List<CareProductDTO> getAllCareProducts();
    CareProductDTO getCareProductById(long id);
    CareProductDTO saveCareProduct(CareProductDTO user);
    CareProductDTO updateCareProduct(CareProductDTO user);
    void deleteCareProductById(long id);
}
