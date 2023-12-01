package com.Empopasto.Ws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.Empopasto.Ws.repository.EmpopastoRepository;
import www.Ws.emp.PrintRequest;
import www.Ws.emp.PrintResponse;

@Endpoint
public class EmpopastoEndpoint {
    
    private static final String NAMESPACE_URI = "http://www.Ws.com/emp";

    private EmpopastoRepository empopastoRepository;

    public EmpopastoEndpoint(EmpopastoRepository empopastoRepository) {
        this.empopastoRepository = empopastoRepository;
    }

    /*declarar un objeto response llamado PrintErrorResp con
     * CodErr Int
     * MsgErr String
     */
        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "printRequest")
    @ResponsePayload
    public PrintResponse getFactura(@RequestPayload PrintRequest request) {
        PrintResponse response = new PrintResponse();
        response.setCodErr(0);
        response.setMsgErr("Proceso exitoso de consulta - admite el pago");
        if (empopastoRepository.ImprimirFactura(request.getCodigoUsuario()).getCadenaRta() ==null) {   
        response.setCodErr(-100);
        response.setMsgErr("Codigo de suscriptor no valido");    
        }
        
        response.setFactura(empopastoRepository.ImprimirFactura(request.getCodigoUsuario()));
        return response;
    }

}
