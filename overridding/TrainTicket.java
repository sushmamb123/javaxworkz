package overriding.com;

public class TrainTicket extends Ticket {
	@Override
	public void ticketInfo() {
		System.out.println("invoking ticketInfo in TrainTicket");
		super.ticketInfo();
	}

}
