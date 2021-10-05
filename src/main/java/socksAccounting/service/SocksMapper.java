package socksAccounting.service;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import socksAccounting.Socks;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@Component
public class SocksMapper implements RowMapper<Socks> {

    @Override
    public Socks mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Socks(rs.getString("color"),
                            rs.getInt("cottonPart"),
                            rs.getInt("quantity"));
    }
}
