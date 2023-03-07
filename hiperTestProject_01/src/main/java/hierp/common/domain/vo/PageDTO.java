package hierp.common.domain.vo;

import org.springframework.stereotype.Component;

@Component
public class PageDTO {
    private int pageCount;
    private int startPage;
    private int endPage;
    private int realEnd;
    private boolean prev, next;
    private int total;
    private Criteria criteria;

    public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
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
		return "PageDTO [pageCount=" + pageCount + ", startPage=" + startPage + ", endPage=" + endPage + ", realEnd="
				+ realEnd + ", prev=" + prev + ", next=" + next + ", total=" + total + ", criteria=" + criteria + "]";
	}
	
	public PageDTO createPageDTO(Criteria criteria, int total){
        return createPageDTO(criteria, total, 10);
    }

    public PageDTO createPageDTO(Criteria criteria, int total, int pageCount){
        this.criteria = criteria;
        this.total = total;
        this.pageCount = pageCount;
        this.endPage = (int)(Math.ceil(criteria.getPage() / (double)pageCount)) * pageCount;
        this.startPage = endPage - pageCount + 1;
        this.realEnd = (int)(Math.ceil((double)total / criteria.getAmount()));
        if(realEnd < endPage){
            endPage = realEnd == 0 ? 1 : realEnd;
        }
        this.prev = startPage > 1;
        this.next = endPage < realEnd;

        return this;
    }
}
