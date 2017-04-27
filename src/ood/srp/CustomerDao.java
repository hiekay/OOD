package ood.srp;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
	protected List<Customer> findCustomer() {
		List<Customer> ret = new ArrayList<Customer>();
		ret.add(new Customer("zhagnsan", 30));
		ret.add(new Customer("lisi", 25));
		return ret;
	}
}
