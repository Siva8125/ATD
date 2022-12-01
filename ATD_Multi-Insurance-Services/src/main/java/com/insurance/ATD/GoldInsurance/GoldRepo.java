package com.insurance.ATD.GoldInsurance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GoldRepo extends CrudRepository<GoldBean, Integer>{

}
