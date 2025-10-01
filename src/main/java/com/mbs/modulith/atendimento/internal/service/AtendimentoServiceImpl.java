package com.mbs.modulith.atendimento.internal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbs.modulith.atendimento.AtendimentoService;
import com.mbs.modulith.atendimento.internal.config.AtendimentoMapper;
import com.mbs.modulith.atendimento.AtendimentoDto;

@Service
public class AtendimentoServiceImpl implements AtendimentoService {

	@Autowired
	private AtendimentoMapper atendimentoMapper;
	
	@Override
	public void salvar(AtendimentoDto atendimentoDto) {
		var atendimentoEntity = atendimentoMapper.atendimentoToEntity(atendimentoDto);

	}

	@Override
	public List<AtendimentoDto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
