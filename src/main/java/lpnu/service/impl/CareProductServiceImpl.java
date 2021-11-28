package lpnu.service.impl;


import lpnu.dto.CareProductDTO;
import lpnu.entity.CareProduct;
import lpnu.mapper.CareProductToCareProductDTOMapper;
import lpnu.repository.CareProductRepository;
import lpnu.service.CareProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CareProductServiceImpl implements CareProductService {


        @Autowired
        private CareProductToCareProductDTOMapper careProductMapper;

        @Autowired
        private CareProductRepository careProductRepository;

        @Override
        public List<CareProductDTO> getAllCareProducts() {
            return careProductRepository.getAllCareProduct().stream()
                    .map(e -> careProductMapper.toDTO(e))
                    .collect(Collectors.toList());
        }

        @Override
        public CareProductDTO getCareProductById(final long id) {
            return careProductMapper.toDTO(careProductRepository.getCareProductById(id));
        }

        @Override
        public CareProductDTO saveCareProduct(final CareProductDTO userDTO) {

            final CareProduct careProduct = careProductMapper.toEntity(userDTO);

            careProductRepository.saveCareProduct(careProduct);

            return careProductMapper.toDTO(careProduct);
        }

        @Override
        public CareProductDTO updateCareProduct(final CareProductDTO careProductDTO) {

            final CareProduct careProduct = careProductMapper.toEntity(careProductDTO);

            return careProductMapper.toDTO(careProductRepository.updateCareProduct(careProduct));
        }

        @Override
        public void deleteCareProductById(final long id) {
            careProductRepository.deleteCareProductById(id);
        }


}
