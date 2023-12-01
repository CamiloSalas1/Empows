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
            try (CallableStatement call = connection.prepareCall("{call aqvaplus.PROIMPDUWS(?, ?, ?, ?)}")) {
                call.setLong(1, idFactura);
                call.registerOutParameter(2, Types.VARCHAR);
                call.registerOutParameter(3, Types.NUMERIC);
                call.registerOutParameter(4, Types.VARCHAR);
                //call.registerOutParameter(3, Types.NUMERIC);              
                call.execute();
                System.out.println("Codigo "+call.getInt(3)+" Error: "+call.getString(4));
                if (call.getInt(3) == 0) {
                    return call.getString(2);
                }
                else{ 
                    return call.getString(4);
                }
                
            } finally {
                connection.setAutoCommit(true);
            }
        });
        return facturas;
    }
}
