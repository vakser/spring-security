package com.example.repository;

import com.example.model.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface NoticeRepository extends CrudRepository<Notice, Long> {
	
	@Query(value = "from Notice n where CURDATE() BETWEEN n.noticeBegDate AND n.noticeEndDate")
	List<Notice> findAllActiveNotices();

}
