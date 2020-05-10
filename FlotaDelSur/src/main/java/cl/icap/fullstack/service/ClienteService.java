package cl.icap.fullstack.service;

import java.util.List;

import cl.icap.fullstack.model.dto.ClienteDto;

public interface ClienteService {
		public int insert(ClienteDto clienteDto);
		public ClienteDto get(int CLIENTE_ID );
		public int update(ClienteDto clienteDto );
		public int delete (int CLIENTE_ID);
		public List<ClienteDto> list();

	}


