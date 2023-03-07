package hierp.common.domain.vo;

import org.springframework.stereotype.Component;

@Component
public class Criteria {
	private int page;
	private int amount;
	
	 public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", amount=" + amount + "]";
	}
	public Criteria create(int page, int amount) {
		this.page = page;
		this.amount = amount;
		return this;
	}
	
}
