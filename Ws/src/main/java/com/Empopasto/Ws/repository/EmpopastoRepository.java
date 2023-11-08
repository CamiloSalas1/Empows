package com.Empopasto.Ws.repository;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import com.Empopasto.Ws.Service.EmpopastoService;
import www.Ws.emp.Factura;

@Component
public class EmpopastoRepository {

    private static final Map<Integer, Factura> facturas = new HashMap<>();
    private final EmpopastoService empopastoService;

    public EmpopastoRepository(EmpopastoService empopastoService) {
        this.empopastoService = empopastoService;
    }
    @PostConstruct
    public void initData() {
        
    }

    public Factura ImprimirFactura(int codigo_usuario) {

        Factura emp1 = new Factura();
        emp1.setCodigoUsuario(codigo_usuario);
        emp1.setCadenaRta(empopastoService.traerFactura(codigo_usuario));  
        facturas.put(emp1.getCodigoUsuario(), emp1);    
        return facturas.get(codigo_usuario);
    }
    
}
