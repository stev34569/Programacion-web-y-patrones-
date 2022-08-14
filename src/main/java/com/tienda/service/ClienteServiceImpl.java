package com.tienda.service;

import com.tienda.dao.ClienteDao;
import com.tienda.dao.CreditoDao;
import com.tienda.domain.Cliente;
import com.tienda.domain.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    public ClienteDao clienteDao;
    @Autowired
    public CreditoDao creditoDao;

    @Override
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }
 @Override
    public void save(Cliente cliente) {
        Credito credito= cliente.getCredito();
        credito= creditoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }
    
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);

    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);

    }

}
