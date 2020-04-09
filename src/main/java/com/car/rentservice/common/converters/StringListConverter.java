package com.car.rentservice.common.converters;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created By Shameera.A on 3/28/2020
 */
@Converter(autoApply = true)
public class StringListConverter implements AttributeConverter<List<String>, String> {

    private static final String SPLIT_CHAR = ",";

    @Override
    public String convertToDatabaseColumn(List<String> stringList) {
        if(stringList.isEmpty()){
            return "";
        }
        return String.join(SPLIT_CHAR, stringList);
    }

    @Override
    public List<String> convertToEntityAttribute(String string) {
        if(Objects.isNull(string)){
            return Arrays.asList();
        }
        return Arrays.asList(string.split(SPLIT_CHAR));
    }
}
