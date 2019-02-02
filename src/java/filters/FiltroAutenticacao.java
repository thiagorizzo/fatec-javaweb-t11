package filters;

import javax.servlet.DispatcherType;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "FiltroAutenticacao",
        servletNames = { "AdicionarCarrinhoController", "CadastrarProdutoController" },
        dispatcherTypes = DispatcherType.REQUEST)
public class FiltroAutenticacao {
    
}
