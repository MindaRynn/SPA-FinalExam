package com.mindaryn.assignment3.database;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class PatternJDBCTemplate implements PatternDAO {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void create(String name, String pgroup, String implementation) {
		String SQL = "insert into Pattern (name, pgroup, implementation) values (?, ?, ?)";
		jdbcTemplateObject.update( SQL, name, pgroup, implementation);
		System.out.println("Created Record Name = " + name + " Group = " + pgroup + " Implementation = " + implementation);
		return;
	}
	public Pattern getPattern(Integer id) {
		String SQL = "select * from Pattern where id = ?";
		Pattern pattern = jdbcTemplateObject.queryForObject(SQL,
				new Object[]{id}, new PatternMapper());
		return pattern;
	}
	public List<Pattern> listPatterns() {
		String SQL = "select * from Pattern";
		List <Pattern> patterns = jdbcTemplateObject.query(SQL,
				new PatternMapper());
		return patterns;
	}
	public void delete(Integer id){
		String SQL = "delete from Pattern where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id );
		return;
	}
	public void update(Integer id, String name, String pgroup, String implementation ){
		String SQL = "update Pattern set name = ?, pgroup = ?, implementation = ? where id = ?";
		jdbcTemplateObject.update(SQL, name, pgroup, implementation, id);
		System.out.println("Updated Record with ID = " + id );
		return;
	}
}