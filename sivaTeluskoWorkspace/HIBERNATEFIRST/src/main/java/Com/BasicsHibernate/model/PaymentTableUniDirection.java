package Com.BasicsHibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class PaymentTableUniDirection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	private String paymentMode;
	private String paymentAmount;
	private String payerName;
	@OneToOne(mappedBy = "paymentTableUniDirection")
	private ProductTableUniDirection productTableUniDirection;
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPayerName() {
		return payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public ProductTableUniDirection getProductTableUniDirection() {
		return productTableUniDirection;
	}
	public void setProductTableUniDirection(ProductTableUniDirection productTableUniDirection) {
		this.productTableUniDirection = productTableUniDirection;
	}
	
	
	
	}


