package designPattern_programs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sushant Patwari
 * @since 19/02/2019
 * @aim To implement Mediator design pattern
 */
public class MediatorPattern {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Sush"); // set users
		User user2 = new UserImpl(mediator, "sandy");
		mediator.addUser(user1);
		mediator.addUser(user2);
		user2.send("helloo....."); // user2 will send msg
	}
}

//interface ChatMediator
interface ChatMediator {
	public void sendMessage(String msg, User user);

	void addUser(User user);
}

abstract class User {
	protected ChatMediator mediator;
	protected String name;

	public User(ChatMediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String msg); // abstract method send

	public abstract void receive(String msg);// abstract method receive
}

class ChatMediatorImpl implements ChatMediator {
	private List<User> list; // declare list

	public ChatMediatorImpl() {
		this.list = new ArrayList<>(); // create arraylist
	}

	// method to send message
	@Override
	public void sendMessage(String msg, User user) {
		for (User u : list) {
			if (u != user)
				u.receive(msg);
		}
	}

	// to add user to list
	@Override
	public void addUser(User user) {
		this.list.add(user);

	}
}

class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

//implementation of send
	public void send(String msg) {
		System.out.println(this.name + " : sending message = " + msg);
		mediator.sendMessage(msg, this);
	}

	// implementation of receive
	public void receive(String msg) {
		System.out.println(this.name + " : received message = " + msg);
	}
}
