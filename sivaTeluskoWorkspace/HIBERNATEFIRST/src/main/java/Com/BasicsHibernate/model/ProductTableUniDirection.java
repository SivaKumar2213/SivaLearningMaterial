package Com.BasicsHibernate.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class ProductTableUniDirection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	private String productName;
	private String productAmount;
	private String purchaserName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="paymentId")
	private PaymentTableUniDirection paymentTableUniDirection;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(String productAmount) {
		this.productAmount = productAmount;
	}
	public String getPurchaserName() {
		return purchaserName;
	}
	public void setPurchaserName(String purchaserName) {
		this.purchaserName = purchaserName;
	}
	public PaymentTableUniDirection getPaymentTableUniDirection() {
		return paymentTableUniDirection;
	}
	public void setPaymentTableUniDirection(PaymentTableUniDirection paymentTableUniDirection) {
		this.paymentTableUniDirection = paymentTableUniDirection;
	}
}
