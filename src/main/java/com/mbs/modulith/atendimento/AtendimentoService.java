package com.mbs.modulith.atendimento;

import java.util.List;

public interface AtendimentoService {

	public void salvar(AtendimentoDTO atendimentoDto);
	
	public List<AtendimentoDTO> listar();
}
