package hierp.common.domain.vo;

import org.springframework.stereotype.Component;

@Component
public class Criteria {
	private int pageNum;
	private int amount;
	
	public Criteria() {
		this.pageNum = 1;
		this.amount = 10;
	}
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + "]";
	}

	
}
