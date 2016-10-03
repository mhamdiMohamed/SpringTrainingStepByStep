package com.med.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonJDBCTemplate implements PersonDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(Person person) {
		String SQL = "insert into Person (name, age, id) values (?, ?, ?)";
		jdbcTemplateObject.update(SQL, person.getName(), person.getAge(), person.getId());
		System.out.println("Created Record Name=" + person.getName() + " Age=" + person.getAge());
		return;
	}

	public Person getPerson(Integer id) {
		String SQL = "select * from Person where id = ?";
		Person person = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new PersonMapper());
		return person;
	}

	public List<Person> listPersons() {
		String SQL = "select * from Person";
		List<Person> persons = jdbcTemplateObject.query(SQL, new PersonMapper());
		return persons;
	}

	public void delete(Integer id) {
		String SQL = "delete from Person where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	public void update(Integer id, Integer age) {
		String SQL = "update Person set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
		return;
	}
}