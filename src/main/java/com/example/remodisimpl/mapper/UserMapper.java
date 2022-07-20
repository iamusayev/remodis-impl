package com.example.remodisimpl.mapper;

import com.example.remodisimpl.dao.entity.UserEntity;
import com.remondis.remap.Mapper;
import com.remondis.remap.Mapping;
import dto.UserDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserMapper {


    @Bean
    public Mapper<UserDto, UserEntity> mapEntityToDto(){
        return Mapping.from(UserDto.class)
                .to(UserEntity.class)
                .omitInDestination(UserEntity::getEmail)
                .omitInDestination(UserEntity::getBirthday)
                .omitInDestination(UserEntity::getRole)
                .omitInDestination(UserEntity::getGender)
                .omitInDestination(UserEntity::getId)
                .mapper();
    }

}
