package com.mbs.modulith.atendimento;

import java.util.List;

public interface AtendimentoService {

	public void salvar(AtendimentoDto atendimentoDto);
	
	public List<AtendimentoDto> listar();
}
