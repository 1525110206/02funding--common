package com.javaweb.funding.util;

import java.util.List;

public class Page {
	
	private Integer pageSize; //一页的数目
	private Integer pageno;  //哪一页
	private List datas;
	private Integer totalSize; //总的数目
	private Integer totalno; //总的页数
	
	public Page(Integer pageno, Integer pageSize){
		if(pageno <= 0){
			pageno = 1;
		}else{
			this.pageno = pageno;
		}
		if(pageSize <= 0){
			pageSize = 10;
		}else{
			this.pageSize = pageSize;
		}
		
	}
	
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageno() {
		return pageno;
	}
	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}
	public List getDatas() {
		return datas;
	}
	public void setDatas(List datas) {
		this.datas = datas;
	}
	public Integer getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
		this.totalno = (totalSize%pageSize) == 0? (totalSize/pageSize):((totalSize/pageSize)+1);
	}
	public Integer getTotalno() {
		return totalno;
	}
	//由于总的页数是算出来的，所以要设为private，不能调用这个方法设置
	private void setTotalno(Integer totalno) {
		this.totalno = totalno;
	}
	
	
	public Integer getStartIndex(){
		return (this.pageno-1)*pageSize;
	}
	
	
}
