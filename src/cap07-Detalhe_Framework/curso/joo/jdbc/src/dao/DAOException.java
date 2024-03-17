package dao;

public class DAOException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DAOException(String message, Throwable t) {
		super(message, t);
	}
}
