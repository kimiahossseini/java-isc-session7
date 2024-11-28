package json;

public class transactionInfo {
	private String to;
	private int amount;
	private String description;
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "transactionInfo [to=" + to + ", amount=" + amount + ", description=" + description + "]";
	}
	
}
