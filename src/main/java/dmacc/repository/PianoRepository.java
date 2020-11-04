package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Piano;
//import dmacc.beans.Bench;

@Repository
public interface PianoRepository extends
JpaRepository<Piano, Long> {	
	
}
