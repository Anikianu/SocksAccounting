package socksAccounting.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import socksAccounting.Socks;

import javax.inject.Provider;
import java.util.List;

@Service
public class InputOutputShow {
    private final Provider<JdbcTemplate> jdbcTemplateProvider;
    private final SocksMapper socksMapper;

    public InputOutputShow(Provider<JdbcTemplate> jdbcTemplateProvider, SocksMapper socksMapper) {
        this.jdbcTemplateProvider = jdbcTemplateProvider;
        this.socksMapper = socksMapper;
    }

    public List<Socks> getSocks(String color, String operation, int cottonPart) {
        String query = "SELECT color, cottonPart, quantity FROM list_of_socks WHERE color = ? AND cottonPart = ?";
        List<Socks> socks = jdbcTemplateProvider.get().query(query, socksMapper, color, cottonPart);
        return socks;
    }

}


