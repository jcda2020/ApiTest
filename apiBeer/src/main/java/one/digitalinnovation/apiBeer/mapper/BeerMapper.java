package one.digitalinnovation.apiBeer.mapper;

import one.digitalinnovation.apiBeer.dto.BeerDTO;
import one.digitalinnovation.apiBeer.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
