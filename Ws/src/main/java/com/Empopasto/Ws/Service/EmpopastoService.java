package com.Empopasto.Ws.Service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpopastoService {
     private final JdbcTemplate jdbcTemplate;

    public EmpopastoService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String traerFactura(Integer idFactura) {
        String facturas = jdbcTemplate.execute((Connection connection) -> {
            // Llama al procedimiento almacenado y obtiene el valor de salida
            connection.setAutoCommit(false);
            try (CallableStatement call = connection.prepareCall("{call TRAE_FACTURA(?, ?)}")) {
                call.setLong(1, idFactura);
                call.registerOutParameter(2, Types.VARCHAR);
                call.execute();
                return call.getString(2);
            } finally {
                connection.setAutoCommit(true);
            }
        });
        return facturas;
    }
}
