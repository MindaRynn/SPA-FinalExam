package com.mindaryn.assignment3.database;

import java.util.List;
import javax.sql.DataSource;
public interface PatternDAO {
 /**
 * This is the method to be used to initialize
 * database resources ie. connection.
 */
 public void setDataSource(DataSource ds);
 /**
 * This is the method to be used to create
 * a record in the Pattern table.
 */
 public void create(String name, String pgroup, String implementation);
 /**
 * This is the method to be used to list down
 * a record from the Pattern table corresponding
 * to a passed pattern id.
 */
 public Pattern getPattern(Integer id);
 /**
 * This is the method to be used to list down
 * all the records from the Pattern table.
 */
 public List<Pattern> listPatterns();
 /**
 * This is the method to be used to delete
 * a record from the Pattern table corresponding
 * to a passed pattern id.
 */
 public void delete(Integer id);
 /**
 * This is the method to be used to update
 * a record into the Pattern table.
  */
 public void update(Integer id, String name, String pgroup, String implementation);
}