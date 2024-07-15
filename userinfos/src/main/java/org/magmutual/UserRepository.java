package org.magmutual;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserDetails, Long> {

	//List<UserDetails> findAll();

	//Optional<UserDetails> findById(Long id);
	
	@Query(value = "SELECT * FROM USERINFOS where PARSEDATETIME(datecreated,'dd-MM-yyyy') between PARSEDATETIME(?1,'dd-MM-yyyy') and PARSEDATETIME(?2,'dd-MM-yyyy')", nativeQuery = true)
	List<UserDetails> findByDate(String startDate, String endDate);
	
	@Query(value = "select * from userinfos where profession = ?1", nativeQuery = true)
	List<UserDetails> findByProfession(String profession);
	
	@Query(value = "select * from userinfos where firstname like ?1%", nativeQuery = true)
	List<UserDetails> findByFirstname(String fname);
	
}
