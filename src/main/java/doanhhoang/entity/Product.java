package doanhhoang.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")

public class Product implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "MaSP")
	private String maSP;
	@Column(name = "TenSp")
	private String tenSP;
	@Column(name = "AnhSP")
	private String anhSP;
	@Column(name = "SoLuong")
	private Integer soLuong;
	@Column(name = "DonGia")
	private Double donGia;
	@Column(name = "TrangThai")
	private Boolean trangThai;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getAnhSP() {
		return anhSP;
	}
	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}
	public Integer getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}
	public Double getDonGia() {
		return donGia;
	}
	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}
	public Boolean getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}
	
}
