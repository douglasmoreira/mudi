package com.douglas.mvc.mudi.repository;

import com.douglas.mvc.mudi.model.Pedido;
import com.douglas.mvc.mudi.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatus(StatusPedido aguardando);
}
