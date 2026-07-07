package Com.BasicsHibernate.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
@Entity
public class CustomerDetBidirectional {
	@Id
	@GeneratedValue(generator = "custId",strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "custId",sequenceName = "MyOwn_Customer_seq_id_forBIdirectional",initialValue = 10,allocationSize = 1)
	private Integer CustomerId;
	private String customerName;
	private Integer customerAge;
	//Onetomany is used because one customer can have many orders so only
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "customerDetBidirectional")
	private List<OrderDetBidirectional> orderDetBiArrayList=new ArrayList<>();
	public Integer getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(Integer customerAge) {
		this.customerAge = customerAge;
	}
	public List<OrderDetBidirectional> getOrderDetBiArrayList() {
		return orderDetBiArrayList;
	}
	public void setOrderDetBiArrayList(List<OrderDetBidirectional> orderDetBiArrayList) {
		this.orderDetBiArrayList = orderDetBiArrayList;
	}
	
	
	
}
