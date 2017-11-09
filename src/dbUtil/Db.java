package dbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Db {
	
	Connection _connection;
	
	public Db(Connection con) {
		
		_connection = con;
	}
	
	 /** This method saves the order to the database */
    public void saveOrder()  throws SQLException
    {
              
        String sql = new StringBuffer()
			        		.append("INSERT INTO T_ORDER " )
							.append("(AUTHORIZATION_CODE, " )
							.append("SHIPMETHOD_ID, USER_ID, ADDRESS_ID) " )
							.append("VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ).toString();
			        
        PreparedStatement orderStatement = _connection.prepareStatement(sql);
        orderStatement.executeUpdate();
    }
	
	

}
