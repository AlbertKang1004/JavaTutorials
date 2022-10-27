package javaProject.Lesson37;

@SuppressWarnings("serial")
public class StuffyException extends RuntimeException {

	public StuffyException() {}
	
	public StuffyException(String reason) {
		super(reason);
	}
}
