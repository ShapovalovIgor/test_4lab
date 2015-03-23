package ru.shapovalov.Connection;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by igor on 20.03.15.
 */
public class ConnectImpl implements Connect {

    private DataSource dataSource;

    @Override
    public String getTitle(long id) {
            String result = "";
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("Sselect title FROM book WHERE id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                result = resultSet.getString("title");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return result;
    }
}
