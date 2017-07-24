package ibatis;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class QueryHandler {

  private static SqlMapClient sqlMapper;
  
  public static SqlMapClient getInstance() {
	return sqlMapper;
}

  
  static {
    try {
      Reader reader = Resources.getResourceAsReader("ibatis/SqlMapConfig.xml");
      sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
      reader.close(); 
    } catch (IOException e) {
      // Fail fast.
      throw new RuntimeException("Something bad happened while building the SqlMapClient instance." + e, e);
    }
  }
}

