public class CustomerService {

    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public String getCustomerById(int id) {
        return repository.findCustomerById(id);
    }
}