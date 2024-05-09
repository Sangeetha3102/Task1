package in.BatchTask2.config;

import org.springframework.batch.item.ItemProcessor;

import in.BatchTask2.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer item) throws Exception {
        return item;
    }

}
