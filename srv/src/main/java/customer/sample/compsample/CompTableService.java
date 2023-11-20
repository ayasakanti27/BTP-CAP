package customer.sample.compsample;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompTableService {
    @Autowired
   private CompTableDAO CompTableDAO; 

    
     public Collection<CompTable> getCompTable(){
      
      return CompTableDAO.jgetAllUsers();
     
     }
     

}
