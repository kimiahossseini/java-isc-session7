package json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
	private String name;
	@JsonProperty("balances")
	private String balance;
	
	@JsonProperty("transaction_info")
	private List<transactionInfo> transactionInfo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	

	public List<transactionInfo> getTransactionInfo() {
		return transactionInfo;
	}
	public void setTransactionInfo(List<transactionInfo> transactionInfo) {
		this.transactionInfo = transactionInfo;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + ", transactionInfo=" + transactionInfo + "]";
	}
	

}
