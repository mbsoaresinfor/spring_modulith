package com.mbs.modulith.atendimento.internal.service.entity;

public class AtendimentoEntity {

	private Integer codigo;
	private Integer codigoPaciente;
	private String descricaoAtendimento;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(Integer codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	public String getDescricaoAtendimento() {
		return descricaoAtendimento;
	}
	public void setDescricaoAtendimento(String descricaoAtendimento) {
		this.descricaoAtendimento = descricaoAtendimento;
	}
}
