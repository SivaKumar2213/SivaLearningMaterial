package Com.BasicsHibernate.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderDetBidirectional {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private String orderAmount;
	private String orderProductName;
	private LocalDate orderDate;
	//Here we used many to one because one order cannot be mapped with multiple customer
	//Many order order1 ,order2,order3 can belong to one customer so manytoone is used
	@ManyToOne()
	@JoinColumn(name = "CustomerId")
	private CustomerDetBidirectional customerDetBidirectional;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderProductName() {
		return orderProductName;
	}
	public void setOrderProductName(String orderProductName) {
		this.orderProductName = orderProductName;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public CustomerDetBidirectional getCustomerDetBidirectional() {
		return customerDetBidirectional;
	}
	public void setCustomerDetBidirectional(CustomerDetBidirectional customerDetBidirectional) {
		this.customerDetBidirectional = customerDetBidirectional;
	}
	
	
}
