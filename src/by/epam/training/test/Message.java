package by.epam.training.test;

public class Message <T1, T2> {
	
	private T1 id;
	private T2 message;
	
	public Message(T1 id, T2 message) {
		super();
		this.id = id;
		this.message = message;
	}

	public T1 getId() {
		return id;
	}

	public void setId(T1 id) {
		this.id = id;
	}

	public T2 getMessage() {
		return message;
	}

	public void setMessage(T2 message) {
		this.message = message;
	}
	

}
