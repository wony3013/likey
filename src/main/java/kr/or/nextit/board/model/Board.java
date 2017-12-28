package kr.or.nextit.board.model;

public class Board {
	
	private int bo_seq_no;
	private String bo_type;
	private String bo_title;
	private String bo_content;
	private int bo_writer;
	private int bo_hit_cnt;
	private String bo_open_yn;
	private String bo_del_yn;
	private int bo_like_cnt;
	private String reg_user;
	private String reg_date;
	private String upd_user;
	private String upd_date;
	
	public int getBo_seq_no() {
		return bo_seq_no;
	}
	public void setBo_seq_no(int bo_seq_no) {
		this.bo_seq_no = bo_seq_no;
	}
	public String getBo_type() {
		return bo_type;
	}
	public void setBo_type(String bo_type) {
		this.bo_type = bo_type;
	}
	public String getBo_title() {
		return bo_title;
	}
	public void setBo_title(String bo_title) {
		this.bo_title = bo_title;
	}
	public String getBo_content() {
		return bo_content;
	}
	public void setBo_content(String bo_content) {
		this.bo_content = bo_content;
	}
	public int getBo_writer() {
		return bo_writer;
	}
	public void setBo_writer(int bo_writer) {
		this.bo_writer = bo_writer;
	}
	public int getBo_hit_cnt() {
		return bo_hit_cnt;
	}
	public void setBo_hit_cnt(int bo_hit_cnt) {
		this.bo_hit_cnt = bo_hit_cnt;
	}
	public String getBo_open_yn() {
		return bo_open_yn;
	}
	public void setBo_open_yn(String bo_open_yn) {
		this.bo_open_yn = bo_open_yn;
	}
	public String getBo_del_yn() {
		return bo_del_yn;
	}
	public void setBo_del_yn(String bo_del_yn) {
		this.bo_del_yn = bo_del_yn;
	}
	public int getBo_like_cnt() {
		return bo_like_cnt;
	}
	public void setBo_like_cnt(int bo_like_cnt) {
		this.bo_like_cnt = bo_like_cnt;
	}
	public String getReg_user() {
		return reg_user;
	}
	public void setReg_user(String reg_user) {
		this.reg_user = reg_user;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getUpd_user() {
		return upd_user;
	}
	public void setUpd_user(String upd_user) {
		this.upd_user = upd_user;
	}
	public String getUpd_date() {
		return upd_date;
	}
	public void setUpd_date(String upd_date) {
		this.upd_date = upd_date;
	}
	
	
	
}
