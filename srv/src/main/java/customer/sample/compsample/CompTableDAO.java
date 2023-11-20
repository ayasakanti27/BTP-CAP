package customer.sample.compsample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Component
public class CompTableDAO{
    @PersistenceContext
    private EntityManager entityManager;
 
    public Collection<CompTable> jgetAllUsers() {
        try {
            Collection<CompTable> results = new ArrayList<CompTable>();
            if (entityManager != null) {
                  StoredProcedureQuery spEmployees = entityManager
                    .createStoredProcedureQuery("GET_COMP_TABLE_BY_ID", "user_mapping");
            spEmployees.execute();
            @SuppressWarnings("unchecked")
            Collection<CompTable> tempResults = spEmployees.getResultList();
            results.addAll(tempResults);
            }
            // else {      
            // }
 
           return results;
        } catch (Exception exception) {
            throw exception;
        }
    }
}