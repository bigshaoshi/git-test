package com.cskaoyan.shopping.converter;

import com.cskaoyan.mall.dto.ItemDto;
import com.cskaoyan.mall.dto.ProductDetailDto;
import com.cskaoyan.shopping.dal.entitys.Item;
import com.cskaoyan.mall.dto.ProductDto;
import com.cskaoyan.shopping.dal.entitys.Item2;
import com.cskaoyan.shopping.dal.entitys.ItemCat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductConverter {

    @Mappings({
            @Mapping(source = "id",target = "productId"),
            @Mapping(source = "title",target = "productName"),
            @Mapping(source = "price",target = "salePrice"),
            @Mapping(source = "sellPoint",target = "subTitle"),
            @Mapping(source = "imageBig",target = "picUrl")
    })
    ProductDto item2Dto(Item item);

    List<ProductDto> items2Dto(List<Item> items);

    ItemDto item2ItemDto(Item item);

    List<ItemDto> items2ItemDtos(List<Item> items);


}
