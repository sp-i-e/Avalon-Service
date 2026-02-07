package com.avalon.db;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;

@Component
public class SqlitePragmas {

    public SqlitePragmas(DataSource ds) throws SQLException {
        try (var c = ds.getConnection();
             var s = c.createStatement()) {

            s.execute("PRAGMA journal_mode=WAL;");
            s.execute("PRAGMA synchronous=NORMAL;");
            s.execute("PRAGMA foreign_keys=ON;");
            s.execute("PRAGMA busy_timeout=5000;");
        }
    }
}