package employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import employee.Book;

public  final class BookMapper implements RowMapper<Book> {
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book b = new Book();
		b.setId(rs.getInt("id"));
		b.setTitle(rs.getString("title"));
		b.setNbPages(rs.getInt("nb_pages"));
		b.setAuthor(rs.getString("author"));
		b.setPublication_date(rs.getDate("publication_date"));
		return b;
		}
}
