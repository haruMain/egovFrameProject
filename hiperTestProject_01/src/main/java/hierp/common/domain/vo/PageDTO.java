package hierp.common.domain.vo;

public class PageDTO {
	private int startPage;
	private int endPage;
	private int realEnd;
	private boolean prev, next;
	
	public PageDTO() {;}	
	
	private int total;
	private Criteria criteria;
	
	public PageDTO(int total, Criteria criteria) {
		this.total = total;
		this.criteria = criteria;
		
		this.endPage = (int)(Math.ceil(criteria.getPageNum() / (double)criteria.getAmount())) * criteria.getAmount();
		this.startPage = endPage - (criteria.getAmount() - 1);
		
		this.realEnd = (int)Math.ceil(total * 1.0 / criteria.getAmount());
		
		if(this.realEnd < this.endPage) {
			this.endPage = this.realEnd;
		}
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < this.realEnd;
	}
	
	
	

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getRealEnd() {
		return realEnd;
	}

	public void setRealEnd(int realEnd) {
		this.realEnd = realEnd;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public String toString() {
		return "PageDTO [startPage=" + startPage + ", endPage=" + endPage + ", realEnd=" + realEnd + ", prev=" + prev
				+ ", next=" + next + ", total=" + total + ", criteria=" + criteria + ", getStartPage()="
				+ getStartPage() + ", getEndPage()=" + getEndPage() + ", getRealEnd()=" + getRealEnd() + ", isPrev()="
				+ isPrev() + ", isNext()=" + isNext() + ", getTotal()=" + getTotal() + ", getCriteria()="
				+ getCriteria() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
