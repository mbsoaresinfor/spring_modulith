package com.mbs.modulith.atendimento.internal.config;

import org.mapstruct.*;

import com.mbs.modulith.atendimento.AtendimentoDto;
import com.mbs.modulith.atendimento.internal.service.entity.AtendimentoEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface AtendimentoMapper {

		AtendimentoDto atendimentoToDto(AtendimentoEntity atendimentoEntity);
		AtendimentoEntity atendimentoToEntity(AtendimentoDto atendimentoDto);	
}
