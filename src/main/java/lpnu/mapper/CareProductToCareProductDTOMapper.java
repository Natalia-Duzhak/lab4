package lpnu.mapper;


import lpnu.dto.CareProductDTO;
import lpnu.entity.CareProduct;
import org.springframework.stereotype.Component;

@Component
public class CareProductToCareProductDTOMapper {


        public CareProduct toEntity(final CareProductDTO careProductDTO){
            final CareProduct careProduct = new CareProduct();

            careProduct.setId(careProductDTO.getId());
            careProduct.setName(careProductDTO.getName());
            careProduct.setVolume(careProductDTO.getVolume());
            careProduct.setPrice(careProductDTO.getPrice());




            return careProduct;
        }
        public CareProductDTO toDTO(final CareProduct careProduct){
            final CareProductDTO careProductDTO = new CareProductDTO();

            careProductDTO.setId(careProduct.getId());
            careProductDTO.setName(careProduct.getName());
            careProductDTO.setVolume(careProduct.getVolume());
            careProductDTO.setPrice(careProduct.getPrice());



            return careProductDTO;
        }



}
